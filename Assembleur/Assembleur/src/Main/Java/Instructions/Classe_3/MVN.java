package Instructions.Classe_3;

/**
 * Created by Thoma on 12/22/2016.
 */
public class MVN extends Instruction3{
    private String name = "MVN";
    private boolean reg = true;
    private String code_op = "1111";

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
