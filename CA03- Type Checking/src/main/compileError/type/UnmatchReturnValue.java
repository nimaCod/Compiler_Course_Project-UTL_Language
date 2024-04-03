package main.compileError.type;

import main.compileError.CompileError;

public class UnmatchReturnValue extends CompileError {

    int line;
    public UnmatchReturnValue(int lines){
        this.line = line;
    }
    public String getMessage(){
        return "Line:" + line + ":Return value does not match with method return type";
    }


}
