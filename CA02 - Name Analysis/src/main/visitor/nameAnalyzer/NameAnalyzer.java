package main.visitor.nameAnalyzer;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.statement.Statement;
import main.ast.node.expression.*;
import main.compileError.CompileError;
import main.symbolTable.SymbolTable;
import main.symbolTable.symbolTableItems.*;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.visitor.Visitor;
import java.util.ArrayList;
import main.compileError.name.*;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

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
        SymbolTable onInitSymbolTable = new SymbolTable(SymbolTable.top, onInitItem.getKey());
        onInitItem.setOnInitSymbolTable(onInitSymbolTable);

        try {
            SymbolTable.top.put(onInitItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new PrimitiveFunctionRedefinition(onInitDeclaration.getLine(), onInitDeclaration.getTradeName().getName()));
        }

        SymbolTable.push(onInitSymbolTable);

        for (Statement statement : onInitDeclaration.getBody())
            statement.accept(this);

        Identifier tradeName = onInitDeclaration.getTradeName();
        tradeName.accept(this);

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(OnStartDeclaration onStartDeclaration) {
        OnStartItem onStartItem = new OnStartItem(onStartDeclaration);
        SymbolTable onStartSymbolTable = new SymbolTable(SymbolTable.top, onStartItem.getKey()); // TODO instead of get name we should use onStartItem.getKey()  for all function calls

        onStartItem.setOnStartSymbolTable(onStartSymbolTable);



            try {
                SymbolTable.top.put(onStartItem);
            } catch (ItemAlreadyExistsException e) {
                    nameErrors.add(new PrimitiveFunctionRedefinition(onStartDeclaration.getLine(), onStartDeclaration.getTradeName().getName()));
            }
            SymbolTable.push(onStartSymbolTable);


        for (Statement statement : onStartDeclaration.getBody())
            statement.accept(this);

        Identifier tradeName = onStartDeclaration.getTradeName();
        tradeName.accept(this);

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        MainItem mainItem = new MainItem(mainDeclaration);
        SymbolTable mainSymbolTable = new SymbolTable(SymbolTable.top,mainItem.getKey());//TODO Array for trades name?
        mainItem.setMainSymbolTable(mainSymbolTable);
            try {
                SymbolTable.top.put(mainItem);
            } catch (ItemAlreadyExistsException e) {
                nameErrors.add(new MethodRedefinition(mainDeclaration.getLine(), mainItem.getKey()));//TODO Array for  trades name?
            }
        SymbolTable.push(mainSymbolTable);
        for (VarDeclaration varDeclaration : mainDeclaration.getMainTrades())
            varDeclaration.accept(this);
        for (Statement statement : mainDeclaration.getBody())
            statement.accept(this);

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        SymbolTable functionSymbolTable = new SymbolTable(SymbolTable.top, functionItem.getKey());
        functionItem.setHandlerSymbolTable(functionSymbolTable);

            try {
                SymbolTable.top.put(functionItem);
            } catch (ItemAlreadyExistsException e) {
                    nameErrors.add(new MethodRedefinition(functionDeclaration.getLine(), functionDeclaration.getName().getName()));
            }
        SymbolTable.push(functionSymbolTable);

        for (VarDeclaration varDeclaration : functionDeclaration.getArgs())
            varDeclaration.accept(this);
        for (Statement statement : functionDeclaration.getBody())
            statement.accept(this);

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        VariableItem  variableItem = new  VariableItem(varDeclaration);
        SymbolTable variableSymbolTable = new SymbolTable(SymbolTable.top, varDeclaration.getIdentifier().getName());
        variableItem.setVarSymbolTable(variableSymbolTable);

        variableItem.setName("ّFunction_" + variableItem.getName());
        try {
            SymbolTable.top.put(variableItem);
        } catch (ItemAlreadyExistsException e) {
            nameErrors.add(new FunctionVariableConflict(varDeclaration.getLine(), varDeclaration.getIdentifier().getName()));
        }

        varDeclaration.getIdentifier().setName(varDeclaration.getIdentifier().getName());

            try {
                SymbolTable.top.put(variableItem);
            } catch (ItemAlreadyExistsException e) {
                if(SymbolTable.top == SymbolTable.root){
                    nameErrors.add(new GlobalVariableRedefinition(varDeclaration.getLine(),varDeclaration.getIdentifier().getName()));
                    variableItem.setName(variableItem.getKey());
                } else {
                    Boolean flag = false;

                    for (String s : variableItem.primitives) {
                        if (variableItem.getName().equals(s)) {
                            nameErrors.add(new IrregularDefenition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName()));
                            flag = true;
                            String prevName = variableItem.getName();
                            while(true){
                                try{
                                    variableItem.setName(prevName+'_');
                                    SymbolTable.top.put(variableItem);
                                    break;
                                }catch (ItemAlreadyExistsException e2){
                                    prevName = prevName + '-';
                                }
                            }
                            break;
                        }
                    }
                    if (!flag)
                        nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), varDeclaration.getIdentifier().getName()));
                }
            }
        SymbolTable.push(variableSymbolTable);
        Identifier identifier = varDeclaration.getIdentifier();
            identifier.accept(this);

        SymbolTable.pop();

        return null;
    }
}

