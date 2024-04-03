package main.visitor.typeAnalyzer;

import main.ast.node.expression.*;
import main.ast.node.expression.operators.BinaryOperator;
import main.ast.node.expression.operators.UnaryOperator;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.type.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.symbolTable.itemException.ItemNotFoundException;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;
import main.ast.type.*;
import main.ast.node.expression.values.*;
import java.util.ArrayList;

public class ExpressionTypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors;

    public ExpressionTypeChecker(ArrayList<CompileError> typeErrors) {
        this.typeErrors = typeErrors;
    }

    public boolean sameType(Type el1, Type el2) {
        return el1.getClass().equals(el2.getClass()) && !(el1 instanceof NoType || el2 instanceof NoType);
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        Type expType = unaryExpression.getOperand().accept(this);
        UnaryOperator operator = unaryExpression.getUnaryOperator();
//        System.out.println(": Got Here " + expType.toString());

        if (expType instanceof IntType) {
            return new IntType();
        }
        else{
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
        }
        return new NoType();
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type lv = binaryExpression.getLeft().accept(this);
        Type rv = binaryExpression.getRight().accept(this);
        BinaryOperator operator = binaryExpression.getBinaryOperator();


        switch (operator) {
            case PLUS, MINUS, MULT , DIV , MOD -> {
//               System.out.println(binaryExpression.getLine()+": Got Here " + lv.toString() + " " + rv.toString());

                if (lv instanceof IntType && rv instanceof IntType) {
                    return new IntType();
                }
                if (lv instanceof FloatType && rv instanceof FloatType) {
                    return new FloatType();
                }
                if ((lv instanceof NoType && (rv instanceof IntType || rv instanceof FloatType)) ||
                        (rv instanceof NoType && (lv instanceof IntType || lv instanceof FloatType))) {
                    return new NoType();
                }
            }
            case EQ, NEQ , GT, LT -> {
                //System.out.println("Got Here " + lv.toString() + " " + rv.toString());
                if (sameType(lv, rv)) {
                    return new BoolType();
                }
                if (lv instanceof NoType || rv instanceof NoType) {
                    return new NoType();
                }
            }
        }

        typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.name()));
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            VariableItem var = (VariableItem) SymbolTable.top.get(VariableItem.START_KEY + identifier.getName());
            return var.getType();
        } catch (ItemNotFoundException e) { // variable is used but does not exists so we return no type
            VariableItem vi = new VariableItem(identifier.getName(), new NoType());
            try {
                SymbolTable.top.put(vi);
            }
            catch (ItemAlreadyExistsException ee) {
                // handled in name anlysis
            }
            return new NoType();
        }
    }

    @Override
    public Type visit(ArrayIdentifier arrayAccess) {
        try {
            VariableItem var = (VariableItem) SymbolTable.top.get(VariableItem.START_KEY + arrayAccess.getName());
            if (arrayAccess.getIndex().accept(this) instanceof IntType) {
//                System.out.println("varType: " +var.getType());

                return var.getType();
            }
            return new NoType();
        } catch (ItemNotFoundException e) {  // variable is used but does not exists so we return no type
            VariableItem aa = new VariableItem(arrayAccess.getName(), new NoType());
            try {
                SymbolTable.top.put(aa);
            }
            catch (ItemAlreadyExistsException ee) {
                // Handled in name analysis
            }
            return new NoType();
        }
    }

    @Override
    public Type visit(FunctionCall functionCall) {
        try {
            FunctionItem funcItem = (FunctionItem) SymbolTable.top.get(FunctionItem.START_KEY + functionCall.getFunctionName().getName());
            ArrayList<Expression> args = functionCall.getArgs();
            if (funcItem.getFunctionDeclaration() == null) {
                return new NoType();
            }
//           System.out.println(": Got Here " +funcItem.getFunctionDeclaration().getReturnType());

            return funcItem.getFunctionDeclaration().getReturnType();
        } catch (ItemNotFoundException e) { // function is not declared but used so return no type
            ArrayList<Type> arrl = new ArrayList<>();
            for (var item : functionCall.getArgs()) {
                arrl.add(item.getType());
            }
            FunctionItem vi = new FunctionItem(functionCall.getFunctionName().getName(), arrl);
            try {
                SymbolTable.top.put(vi);
            }
            catch (ItemAlreadyExistsException ee) {
                // handled in name analyzer
            }
            return new NoType();
        }
    }
    public Type visit(MethodCall methodCall){
        try {
            VariableItem var = (VariableItem) SymbolTable.top.get(VariableItem.START_KEY + methodCall.getInstance());
            Type t2 = methodCall.getFunctionName().accept(this);

            for (var item : methodCall.getArgs()) {
                item.accept(this);
            }

            return new NoType();
        } catch (ItemNotFoundException e) {  // variable is used but does not exists so we return no type
            VariableItem aa = new VariableItem(methodCall.getInstance().toString(), new NoType());
            try {
                SymbolTable.top.put(aa);
            }
            catch (ItemAlreadyExistsException ee) {
                // Handled in name analysis
            }
            return new NoType();
        }
    }
 public Type visit(VarAccess varAccess){
        try {
            VariableItem var = (VariableItem) SymbolTable.top.get(VariableItem.START_KEY + varAccess.getInstance());
            return varAccess.getVariable().accept(this);
        } catch (ItemNotFoundException e) {  // variable is used but does not exists so we return no type
            VariableItem aa = new VariableItem(varAccess.getInstance().toString(), new NoType());
            try {
                SymbolTable.top.put(aa);
            }
            catch (ItemAlreadyExistsException ee) {
                // Handled in name analysis
            }
            return new NoType();
        }
    }

    @Override
    public Type visit(IntValue value) {
        return new IntType();
    }

    @Override
    public Type visit(FloatValue value) {
        return new FloatType();
    }

}