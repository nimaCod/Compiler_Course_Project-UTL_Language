package main.ast.node;

import main.visitor.IVisitor;
import main.visitor.Visitor;
import java.util.List;

public abstract class Node {

    private int line;

    public void setLine(int line_num) {
        this.line = line_num;
    }

    public int getLine() {
        return this.line;
    }

    public abstract <T> T accept(IVisitor<T> visitor);
    @Override
    public String toString() {
        String[] splited =  this.getClass().getName().split("\\.");
        return splited[splited.length - 1];
    }
}
