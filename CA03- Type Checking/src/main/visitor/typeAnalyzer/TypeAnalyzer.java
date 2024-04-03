package main.visitor.typeAnalyzer;


import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.expression.Expression;
import main.ast.node.expression.FunctionCall;
import main.ast.node.statement.Statement;
import main.ast.type.complexType.TradeType;
import main.ast.type.primitiveType.BoolType;
import main.compileError.CompileError;
import main.compileError.name.FunctionVariableConflict;
import main.compileError.name.MethodRedefinition;
import main.compileError.name.PrimitiveFunctionRedefinition;
import main.compileError.type.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;
import main.ast.node.statement.*;
import main.ast.type.*;

import java.util.ArrayList;

public class TypeAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker(typeErrors);

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);
        for (VarDeclaration varDeclaration : program.getVars())
            varDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration : program.getFunctions())
            functionDeclaration.accept(this);
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(OnInitDeclaration onInitDeclaration) {
        OnInitItem onInitItem = new OnInitItem(onInitDeclaration);
        SymbolTable onInitSymbolTable = new SymbolTable(SymbolTable.top, onInitDeclaration.getTradeName().getName());
        onInitItem.setOnInitSymbolTable(onInitSymbolTable);
        try {
            SymbolTable.root.put(onInitItem);
        } catch (ItemAlreadyExistsException e) {
            // handled in name analyzer
        }
        SymbolTable.push(onInitSymbolTable);
        VarDeclaration initArg = new VarDeclaration();
        initArg.setIdentifier(onInitDeclaration.getTradeName());
        initArg.setType(new TradeType());
        initArg.accept(this);
        for (Statement stmt : onInitDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(OnStartDeclaration onStartDeclaration) {
        OnStartItem onStartItem = new OnStartItem(onStartDeclaration);
        SymbolTable onStartSymbolTable = new SymbolTable(SymbolTable.top, onStartDeclaration.getTradeName().getName());
        onStartItem.setOnStartSymbolTable(onStartSymbolTable);
        try {
            SymbolTable.root.put(onStartItem);
        } catch (ItemAlreadyExistsException e) {
            // handled in name analyzer
        }
        SymbolTable.push(onStartSymbolTable);
        VarDeclaration initArg = new VarDeclaration();
        initArg.setIdentifier(onStartDeclaration.getTradeName());
        initArg.setType(new TradeType());
        initArg.accept(this);
        for (Statement stmt : onStartDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        return null;
    }


    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        SymbolTable functionSymbolTable = new SymbolTable(SymbolTable.top, functionDeclaration.getName().getName());
        functionItem.setHandlerSymbolTable(functionSymbolTable);
        try {
            SymbolTable.top.put(functionItem);
        } catch (ItemAlreadyExistsException e) {
            // handled in name analyzer
        }
        SymbolTable.push(functionSymbolTable);


        for (Statement stmt : functionDeclaration.getBody())
            stmt.accept(this);

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        var mainItem = new MainItem(mainDeclaration);
        var mainSymbolTable = new SymbolTable(SymbolTable.top, "main");
        mainItem.setMainSymbolTable(mainSymbolTable);

        SymbolTable.push(mainSymbolTable);

        for (Statement stmt : mainDeclaration.getBody())
            stmt.accept(this);

        return null;
    }


    public Void visit(VarDeclaration varDeclaration) {
        VariableItem varItem = new VariableItem(varDeclaration);
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExistsException e) {
            // Handled in name analisys
        }
        if (varDeclaration.getRValue() != null) {
            Type lv = varDeclaration.getType();
            Type rv = varDeclaration.getRValue().accept(expressionTypeChecker);

// asked in exam and seems to be we should not check this
//            if (!expressionTypeChecker.sameType(rv, lv) && !(rv instanceof NoType) && !(lv instanceof NoType)) {
//                typeErrors.add(new UnsupportedOperandType(varDeclaration.getLine(), "assign"));
//            }
        }

        return null;
    }

    @Override
    public Void visit(ForStmt forLoopStmt) {
        for (Statement stmt : forLoopStmt.getInit())
            stmt.accept(this);

        Type t1 = forLoopStmt.getCondition().accept(expressionTypeChecker);

        if (!(t1 instanceof BoolType)) {
            typeErrors.add(new UnsupportedCondition(forLoopStmt.getCondition().getLine()));
        }
        for (Expression expr : forLoopStmt.getUpdate())
            expr.accept(this);

        for (Statement stmt : forLoopStmt.getBody())
            stmt.accept(this);

        SymbolTable.pop();
        return null;
    }
    @Override
    public Void visit(WhileStmt whileStmt) {

        Type t1 = whileStmt.getCondition().accept(expressionTypeChecker);

        for (Statement stmt : whileStmt.getBody())
            stmt.accept(this);

        SymbolTable.pop();
        return null;
    }

    public Void visit(IfElseStmt ifElseStmt) {
        Type t1 = ifElseStmt.getCondition().accept(expressionTypeChecker);
        if (!(t1 instanceof BoolType)) {
            typeErrors.add(new UnsupportedCondition(ifElseStmt.getCondition().getLine()));
        }
        for (Statement stmt : ifElseStmt.getThenBody())
            stmt.accept(this);
        for (Statement stmt : ifElseStmt.getElseBody())
            stmt.accept(this);
        return null;
    }


    @Override
    public Void visit(AssignStmt assignStmt) {
        Type tl = assignStmt.getLValue().accept(expressionTypeChecker);
        Type tr = assignStmt.getRValue().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(FunctionCall functionCall) {
        try {
            SymbolTable.root.get(FunctionItem.START_KEY + functionCall.getFunctionName().getName());
        } catch (ItemNotFoundException e) {
            // Handled in name analyse
        }

        functionCall.accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        var retExpr = returnStmt.getReturnedExpr();
        if (retExpr != null) {
            retExpr.accept(expressionTypeChecker);
        }
        return null;
    }

    public Void visit(TryCatchStmt tryCatchStmt){
        for (Statement stmt : tryCatchStmt.getElseBody())
            stmt.accept(this);
        for (Statement stmt : tryCatchStmt.getThenBody())
            stmt.accept(this);
        return  null;
    }
    public Void visit(ThrowStmt throwStmt){
        throwStmt.getReturnedExpr().accept(expressionTypeChecker);
        return  null;
    }
    public Void visit(ContinueBreakStmt continueBreakStmt){
        return null;
    }
    public Void visit(ExpressionStmt expressionStmt){
        expressionStmt.getExpression().accept(expressionTypeChecker);
        return null;
    }
}