package Instructions.Classe_8;

import Instructions.Instruction;

/**
 * Created by Thoma on 12/22/2016.
 */
public abstract class Instruction8 implements Instruction{
    private int classe = 8;
    private String code_classe = "1101";

    public int getClasse(){
        return classe;
    }

    public String getCode_classe(){return code_classe;}
}
