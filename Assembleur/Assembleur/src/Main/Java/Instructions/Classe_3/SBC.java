package Instructions.Classe_3;

/**
 * Created by Thoma on 12/22/2016.
 */
public class SBC extends Instruction3{
    private String name = "SBC";
    private boolean reg = true;
    private String code_op = "0110";

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
