package Instructions.Classe_2;

import Instructions.Instruction;

/**
 * Created by Thoma on 12/22/2016.
 */
public abstract class Instruction2 implements Instruction{
    private int classe = 2;
    private String code_classe = "00";

    public int getClasse(){
        return classe;
    }

    public String getCode_classe(){return code_classe;}
}
