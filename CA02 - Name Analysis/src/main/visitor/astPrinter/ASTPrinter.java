package main.visitor.astPrinter;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.expression.*;
import main.ast.node.statement.*;
import main.visitor.Visitor;
import main.ast.node.expression.values.*;

public class ASTPrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message) {
        System.out.println("Line:" + line + ":" + message);
    }
    public void messagePrinterWithVal(int line, String message, String val) {
        System.out.println("Line:" + line + ":" + message + " " + val);
    }
    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
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

    //values
    public Void visit(BoolValue value) {
        if(value.getConstant())
            messagePrinter(value.getLine(),"TradeValue SELL");
        else
            messagePrinter(value.getLine(),"TradeValue BUY");
        return null;
    }

    public Void visit(FloatValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;

    }

    public Void visit(IntValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;

    }

    public Void visit(StringValue value) {
        messagePrinter(value.getLine(), value.toString());
        return null;

    }

    //declarations
    public Void visit(FunctionDeclaration functionDeclaration) {
        messagePrinter(functionDeclaration.getLine(), functionDeclaration.getName().toString());
        if (functionDeclaration.getName() != null)
            functionDeclaration.getName().accept(this);

        if(!functionDeclaration.getArgs().isEmpty())
            for (VarDeclaration varDeclaration : functionDeclaration.getArgs())
                varDeclaration.accept(this);

        if(!functionDeclaration.getBody().isEmpty())
            for (Statement statement : functionDeclaration.getBody())
                statement.accept(this);
        return null;

    }

    public Void visit(MainDeclaration mainDeclaration) {
        messagePrinter(mainDeclaration.getLine(), mainDeclaration.toString());

        if(!mainDeclaration.getMainTrades().isEmpty())
            for (VarDeclaration varDeclaration : mainDeclaration.getMainTrades())
                varDeclaration.accept(this);
        if(!mainDeclaration.getBody().isEmpty())
            for (Statement statement : mainDeclaration.getBody())
                statement.accept(this);
        return null;
    }

    public Void visit(OnInitDeclaration onInitDeclaration) {
        messagePrinter(onInitDeclaration.getLine(), onInitDeclaration.toString());

        if(onInitDeclaration.getTradeName()!=null) {
            Identifier identifier = onInitDeclaration.getTradeName();
            identifier.accept(this);
        }

        if(!onInitDeclaration.getBody().isEmpty())
            for (Statement statement : onInitDeclaration.getBody())
                statement.accept(this);
        return null;
    }

    public Void visit(OnStartDeclaration onstartDeclaration) {
        messagePrinter(onstartDeclaration.getLine(), onstartDeclaration.toString());

        if( onstartDeclaration.getTradeName()!=null){
            Identifier identifier = onstartDeclaration.getTradeName();
            identifier.accept(this);
        }

        if(!onstartDeclaration.getBody().isEmpty())
            for (Statement statement : onstartDeclaration.getBody())
                statement.accept(this);
        return null;
    }

    public Void visit(VarDeclaration varDeclaration) {
        messagePrinterWithVal(varDeclaration.getLine(),varDeclaration.toString(),varDeclaration.getIdentifier().getName());

        if(varDeclaration.getExpression() != null)
            varDeclaration.getExpression().accept(this);
        return null;
    }

    //expressions

    public Void visit(ArrayIdentifier arrayIdentifier) {
        messagePrinterWithVal(arrayIdentifier.getLine(),arrayIdentifier.toString(),arrayIdentifier.getName());
        arrayIdentifier.getIndex().accept(this);
        return null;
    }

    public Void visit(BinaryExpression binaryExpression) {
        messagePrinterWithVal(binaryExpression.getLine(),binaryExpression.toString(),binaryExpression.getBinaryOperator().toString());

        Expression left_expr = binaryExpression.getLeft();
        if(left_expr!=null)
            left_expr.accept(this);

        Expression right_expr = binaryExpression.getRight();
        if(right_expr != null)
            right_expr.accept(this);
        return null;
    }

    public Void visit(Expression expression) {
       messagePrinter(expression.getLine(),expression.toString());
       return null;
    }

    public Void visit(FunctionCall functionCall) {
        messagePrinter(functionCall.getLine(), functionCall.toString());

        functionCall.getFunctionName().accept(this);

        if(!functionCall.getArgs().isEmpty())
            for (Expression expression : functionCall.getArgs())
                expression.accept(this);
        return null;
    }

    public Void visit(Identifier identifier) {
        messagePrinterWithVal(identifier.getLine(),identifier.toString(),identifier.getName());
        return null;
    }

    public Void visit(MethodCall methodCall) {
        messagePrinter(methodCall.getLine(),methodCall.toString());

        Expression instance = methodCall.getInstance();
        if(instance!=null)
            instance.accept(this);
        if(!methodCall.getArgs().isEmpty())
            for (Expression expression : methodCall.getArgs())
                expression.accept(this);

       Identifier functionName = methodCall.getFunctionName();
       if(functionName !=null)
            functionName.accept(this);

        return null;
    }

    public Void visit(UnaryExpression unaryExpression) {
        messagePrinterWithVal(unaryExpression.getLine(),unaryExpression.toString(),unaryExpression.getUnaryOperator().name());

        Expression operand = unaryExpression.getOperand();
        if(operand != null)
            operand.accept(this);

        return null;
    }

    public Void visit(VarAccess varAccess) {
        messagePrinter(varAccess.getLine(), varAccess.toString());

        Expression instance = varAccess.getInstance();
        if(instance !=null)
            instance.accept(this);
        Identifier variable = varAccess.getVariable();

        if(variable != null)
            variable.accept(this);
        return null;
    }

    //statements

    public Void visit(AssignStmt assignStmt) {
        messagePrinter(assignStmt.getLine(),assignStmt.toString());

        Expression lValue = assignStmt.getLValue();
        if(lValue !=null)
            lValue.accept(this);

        Expression Rvalue = assignStmt.getRValue();
        if(Rvalue != null)
            Rvalue.accept(this);
        return null;
    }

    public Void visit(ContinueBreakStmt continueBreakStmt) {
        messagePrinterWithVal(continueBreakStmt.getLine(), continueBreakStmt.toString(),continueBreakStmt.getToken());
        return null;
    }

    public Void visit(ExpressionStmt expressionStmt) {
        Expression expression = expressionStmt.getExpression();
        if(expression != null)
            expression.accept(this);
        return null;
    }

    public Void visit(ForStmt forStmt) {
        messagePrinter(forStmt.getLine(), forStmt.toString());

        for(Statement statement : forStmt.getInit())
            statement.accept(this);
        Expression condition = forStmt.getCondition();
        condition.accept(this);
        for(Expression expression:forStmt.getUpdate())
            expression.accept(this);
        for(Statement statement:forStmt.getBody())
            statement.accept(this);
        return null;
    }

    public Void visit(IfElseStmt ifElseStmt) {
        messagePrinter(ifElseStmt.getLine(), ifElseStmt.toString());
        Expression condition = ifElseStmt.getCondition();
        condition.accept(this);

        for(Statement statement : ifElseStmt.getThenBody())
            statement.accept(this);

        if(!ifElseStmt.getElseBody().isEmpty())
            for(Statement statement : ifElseStmt.getElseBody())
                statement.accept(this);
        return null;
    }

    public Void visit(ReturnStmt returnStmt) {
            Expression returnedExpression = returnStmt.getReturnedExpr();
            if(returnedExpression != null)
                returnedExpression.accept(this);
            return null;
    }

    public Void visit(Statement statement) {
        statement.accept(this);
        return null;
    }

    public Void visit(ThrowStmt throwStmt) {
        messagePrinter(throwStmt.getLine(),throwStmt.toString());

        Expression returnedExpression = throwStmt.getReturnedExpr();
        if(returnedExpression != null)
            returnedExpression.accept(this);
        return null;
    }

    public Void visit(TryCatchStmt tryCatchStmt) {
        messagePrinter(tryCatchStmt.getLine(),tryCatchStmt.toString());
        if(!tryCatchStmt.getTryBody().isEmpty())
            for(Statement statement : tryCatchStmt.getTryBody())
                statement.accept(this);
        if(!tryCatchStmt.getCatchBody().isEmpty())
            for(Statement statement : tryCatchStmt.getCatchBody())
                statement.accept(this);
        return null;
    }

    public Void visit(WhileStmt whileStmt) {
        messagePrinter(whileStmt.getLine(),whileStmt.toString());

        Expression expression = whileStmt.getCondition();
        expression.accept(this);
        for(Statement statement : whileStmt.getBody())
            statement.accept(this);
        return null;
    }
}
