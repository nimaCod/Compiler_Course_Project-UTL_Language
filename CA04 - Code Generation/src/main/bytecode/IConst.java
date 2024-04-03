package main.bytecode;

public class IConst extends Bytecode{
    private final int val;

    public IConst(int val){
        this.val = val;
    }

    private static String getBytecode(int val){
        String res = "";
        int bits = 32 - Integer.numberOfLeadingZeros(val);
        if(val >= 0 && val <= 5){
            res = "iconst_" + val;
        } else if (val == -1) {
            res = "iconst_m1";
        } else if (bits <= 8) {
            res = "bipush " + val;
        } else if (bits <= 16) {
            res = "sipush " + val;
        }
        else {
            res = "Idc " + val;
        }
        return res;
    }

    @Override
    public String toString(){
        return indent(1) + getBytecode(val);
    }
}
