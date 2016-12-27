package Instructions;

import java.util.ArrayList;

/**
 * Created by Thoma on 12/22/2016.
 */
public class MUL implements Instruction{
    private String name = "MUL";
    private boolean reg;
    private String codeop = "1101";
    private String rdm;
    private String rn;

    public MUL(ArrayList<String> key_words){
        reg = isReg(key_words);
        rdm = key_words.get(1);
        rn = key_words.get(2);
    }

    @Override
    public String getCategory() {
        return categoryB;
    }

    public String getName() {
        return name;
    }

    public boolean isReg() {
        return reg;
    }

    @Override
    public String codeopToBin() {
        return codeop;
    }

    @Override
    public String toBin() {
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());
        res.append(rdm);
        res.append(rn);
        return res.toString();
    }

    public String getCodeOp() {
        return codeop;
    }
}
