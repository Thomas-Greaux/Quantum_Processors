package Instructions.Classe_5;

import Instructions.Instruction;

/**
 * Created by Thoma on 12/22/2016.
 */
public abstract class Instruction5 implements Instruction{
    private int classe = 5;
    private String code_classe = "0101";

    public int getClasse(){
        return classe;
    }

    public String getCode_classe(){return code_classe;}
}
