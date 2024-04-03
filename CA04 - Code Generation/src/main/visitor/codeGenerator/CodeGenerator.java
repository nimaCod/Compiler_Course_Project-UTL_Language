package main.visitor.codeGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.jdi.BooleanType;
import main.ast.node.expression.*;
import main.ast.node.statement.*;
import main.bytecode.*;
import main.visitor.Visitor;
import main.ast.type.Type;
import main.ast.node.*;
import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.expression.values.*;
import main.ast.node.statement.*;
import main.ast.type.Type;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.FloatType;
import main.ast.type.primitiveType.*;
import main.bytecode.Bytecode.*;

public class CodeGenerator extends Visitor<List<Bytecode>> {
    Program program;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private JasminClass mainClass;

    private String getTypeStr(Type type) {
        if (type instanceof IntType) {
            return "I";
        } else if (type instanceof FloatType) {
            return "F";
        } else if (type instanceof BooleanType) {
            return "Z";
        }
        return "V";
    }

    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }

    private int calcStackSize(List<Bytecode> stmts) {
        int max = 1;
        int cur = 0;
        for (var stmt : stmts) {
            switch (stmt.getClass().getSimpleName()) {
                case "IAdd", "ISub", "IMul", "IDiv", "IRem", "IXor", "IStore" -> cur -= 1;
                case "IConst", "ILoad", "ALoad", "GetStatic", "InvokeStatic", "InvokeVirtual" -> cur += 1;
                default -> {
                }
            }
            max = Math.max(max, cur);
        }
        return max;
    }

    public CodeGenerator(Program program) {
        this.program = program;
    }

    public Bytecode generate() {
        program.accept(this);
        return mainClass;
    }

    @Override
    public List<Bytecode> visit(Program program) {
        mainClass = new JasminClass(program.toString());
        for (var func : program.getFunctions()) {
            slots.clear();
            mainClass.addMethod(func.accept(this).get(0));
        }
        slots.clear();
        mainClass.addMethod(program.getMain().accept(this).get(0));
        return List.of(mainClass);
    }

    @Override
    public List<Bytecode> visit(MainDeclaration mainDeclaration) {
        List<Bytecode> stmts = new ArrayList<>();
        slotOf("@args");
        for (var stmt : mainDeclaration.getBody()) {
            if (stmt instanceof VarDeclaration ||
                    stmt instanceof AssignStmt ||
                    stmt instanceof ReturnStmt)  {
                stmts.addAll(stmt.accept(this));
            }
        }
        stmts.add(new Return());

        JasminMethod mainMethod = new JasminMethod("main", "V", List.of("[Ljava/lang/String;"), stmts);
        mainMethod.setLocalSize(slots.size());
        mainMethod.setStackSize(calcStackSize(stmts));
        return List.of(mainMethod);
    }

    @Override
    public List<Bytecode> visit(FunctionDeclaration funcDeclaration) {
        List<String> args = new ArrayList<>();
        for (var arg : funcDeclaration.getArgs()) {
            args.add(getTypeStr(arg.getType()));
            slotOf(arg.getIdentifier().getName());
        }

        List<Bytecode> stmts = new ArrayList<>();
        for (var stmt : funcDeclaration.getBody()) {
            if (stmt instanceof VarDeclaration ||
                    stmt instanceof AssignStmt ||
                    stmt instanceof ReturnStmt ) {
                stmts.addAll(stmt.accept(this));
            }
        }

        if (stmts.size() == 0 || !(stmts.get(stmts.size() - 1) instanceof IReturn)) {
            stmts.add(new IReturn());
        }

        JasminMethod method = new JasminMethod(funcDeclaration.getName().getName(),
                getTypeStr(funcDeclaration.getReturnType()),
                args,
                stmts);
        method.setLocalSize(slots.size());
        method.setStackSize(calcStackSize(stmts));
        return List.of(method);
    }

    @Override
    public List<Bytecode> visit(VarDeclaration varDecStmt) {
        List<Bytecode> stmts = new ArrayList<>();
        int slot = slotOf(varDecStmt.getIdentifier().getName());
        Expression init = varDecStmt.getRValue();
        Type type = varDecStmt.getType();

        if (type instanceof IntType || type instanceof BooleanType) {
            if (init != null) {
                stmts.addAll(init.accept(this));
                stmts.add(new IStore(slot));
            }
        }

        return stmts;
    }

    @Override
    public List<Bytecode> visit(AssignStmt assignStmt) {
        List<Bytecode> stmts = new ArrayList<>(assignStmt.getRValue().accept(this));
        int slot = slotOf(((Variable) assignStmt.getLValue()).getName());
        stmts.add(new IStore(slot));
        return stmts;
    }

    @Override
    public List<Bytecode> visit(ReturnStmt returnStmt) {
        if (returnStmt.getReturnedExpr() == null) {
            return List.of(new Return());
        }
        List<Bytecode> stmts = new ArrayList<>(returnStmt.getReturnedExpr().accept(this));
        stmts.add(new IReturn());
        return stmts;
    }

    @Override
    public List<Bytecode> visit(BinaryExpression binaryExpression) {
        List<Bytecode> stmts = new ArrayList<>();
        stmts.addAll(binaryExpression.getLeft().accept(this));
        stmts.addAll(binaryExpression.getRight().accept(this));
        switch (binaryExpression.getBinaryOperator()) {
            case PLUS -> stmts.add(new IAdd());
            case MINUS -> stmts.add(new ISub());
            case MULT -> stmts.add(new IMul());
            case DIV -> stmts.add(new IDiv());
            case MOD -> stmts.add(new IRem());
            default -> {
            }
        }
        return stmts;
    }

    @Override
    public List<Bytecode> visit(UnaryExpression unaryExpression) {
        List<Bytecode> stmts = new ArrayList<>(unaryExpression.getOperand().accept(this));
        switch (unaryExpression.getUnaryOperator()) {
            case INC -> {
            }
            case DEC -> stmts.add(new INeg());
            case NOT -> stmts.addAll(List.of(new IConst(1), new IXor()));
        }
        return stmts;
    }

    @Override
    public List<Bytecode> visit(FunctionCall funcCall) {
        JasminMethod method = mainClass.getMethod(funcCall.getFunctionName().getName());
        if (method == null) {
            return List.of();
        }
        return List.of(new InvokeStatic(mainClass.getName(), method.getName(), method.getSignature()));
    }

    @Override
    public List<Bytecode> visit(Identifier identifier) {
        return List.of(new ILoad(slotOf(identifier.getName())));
    }

    @Override
    public List<Bytecode> visit(IntValue intValue) {
        return List.of(new IConst(intValue.getConstant()));
    }
}