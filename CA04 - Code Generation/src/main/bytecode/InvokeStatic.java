package main.bytecode;

public class InvokeStatic extends Invoke{
    public InvokeStatic(String className , String methodName , String methodsSignature){
        super(className + "/" + methodName , methodsSignature);
        this.invokeType = "static";
    }
}
