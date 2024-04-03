package main.bytecode;

public class InvokeNonVirtual extends Invoke {
    public InvokeNonVirtual(String className , String methodName , String methodsSignature){
        super(className + "/" + methodName , methodsSignature);
        this.invokeType = "nonvirtual";
    }
}
