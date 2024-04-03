package main.ast.node.expression.values;

import main.ast.node.expression.Expression;

public abstract class Variable extends Expression {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = type;
    }
}
