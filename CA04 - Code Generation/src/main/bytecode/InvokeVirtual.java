package main.bytecode;

public class InvokeVirtual extends Invoke{
    public InvokeVirtual(String className , String methodName , String methodsSignature){
        super(className + "/" + methodName , methodsSignature);
        this.invokeType = "virtual";
    }
}
