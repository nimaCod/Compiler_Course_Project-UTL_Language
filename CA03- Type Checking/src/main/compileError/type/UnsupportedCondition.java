package main.compileError.type;

import main.compileError.CompileError;

public class UnsupportedCondition extends CompileError {

    int line;
    public UnsupportedCondition(int line){
        this.line = line;
    }
    public String getMessage(){
        return "Line:" + line + ":Condition must be bool ";
    }


}
