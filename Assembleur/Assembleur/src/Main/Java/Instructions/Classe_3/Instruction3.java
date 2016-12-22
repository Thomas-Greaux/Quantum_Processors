package Instructions.Classe_3;

import Instructions.Instruction;

/**
 * Created by Thoma on 12/22/2016.
 */
public abstract class Instruction3 implements Instruction {
    private int classe = 3;
    private String code_classe = "010000";

    public int getClasse(){
        return classe;
    }

    public String getCode_classe(){return code_classe;}

}
