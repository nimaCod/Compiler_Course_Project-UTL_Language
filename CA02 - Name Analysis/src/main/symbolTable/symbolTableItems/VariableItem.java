package main.symbolTable.symbolTableItems;

import main.ast.node.declaration.VarDeclaration;
import main.ast.type.Type;
import main.symbolTable.SymbolTable;

public class VariableItem extends SymbolTableItem {

    public String[] primitives = {"OnInit", "OnStart", "throw", "return", "catch", "break", "static",
            "shared", "void", "schedule", "double", "Main", "Digits", "BUY", "SELL", "Bid", "Ask", "type",
            "Volume", "Low", "High", "Close", "Open", "Time", "Text", "Trade", "Order", "Candle", "Exception",
            "RefreshRate", "GetCandle", "Terminate", "Connect", "Observe", "Print", "Preorder", "parallel"};

	protected Type type;
	protected VarDeclaration varDeclaration;

    protected SymbolTable varSymbolTable;

    public static final String START_KEY = "Variable_";

	public VariableItem(String name, Type type) {
		this.name = name;
	    this.type = type;
	}
	
    public VariableItem(VarDeclaration varDeclaration)
    {
        this.name = varDeclaration.getIdentifier().getName();
        this.type = varDeclaration.getType();
        this.varDeclaration = varDeclaration;
    }

	public String getName() {
		return name;
	}

	public void setName(String name)
    {
        this.name = name;
        varDeclaration.getIdentifier().setName(name);
    }

	public Type getType() {
		return type;
	}

    public void setType(Type type) {
        this.type = type;
    }

    public void setVarSymbolTable(SymbolTable varSymbolTable)
    {
        this.varSymbolTable = varSymbolTable;
    }

    public VarDeclaration getVarDeclaration()
    {
        return varDeclaration;
    }
    
    public void setVarDeclaration(VarDeclaration varDeclaration)
    {
        this.varDeclaration = varDeclaration;
    }

    @Override
    public String getKey() {
        return VariableItem.START_KEY + this.name;
    }
}
