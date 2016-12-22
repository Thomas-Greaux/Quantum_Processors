package Instructions.Classe_3;

/**
 * Created by Thoma on 12/22/2016.
 */
public class RSB extends Instruction3{
    private String name = "RSB";
    private boolean reg = false;
    private String code_op = "1001";

    public String getName() {
        return name;
    }

    public boolean isReg() {
        return reg;
    }

    public String getCodeOp() {
        return code_op;
    }
}
