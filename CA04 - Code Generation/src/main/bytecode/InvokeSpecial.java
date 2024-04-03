package main.bytecode;

public class InvokeSpecial extends Invoke{
    public InvokeSpecial(String className , String methodName , String methodsSignature){
        super(className + "/" + methodName , methodsSignature);
        invokeType = "special";
    }
}
