package Instructions.Classe_3;

/**
 * Created by Thoma on 12/22/2016.
 */
public class ADC extends Instruction3{
    private String name = "ADC";
    private boolean reg = true;
    private String code_op = "0101";


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
