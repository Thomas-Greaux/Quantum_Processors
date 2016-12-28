package Instructions;

import java.util.ArrayList;

/**
 * Created by Thoma on 12/22/2016.
 */
public class MVN implements Instruction{
    private String name = "MVN";
    private boolean reg;
    private String codeop = "1111";
    private String rd;
    private String rm;

    public MVN(ArrayList<String> key_words){
        reg = isReg(key_words);
        rd = key_words.get(1);
        rm = key_words.get(2);
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
    public void opToBin() {
        rm = ToBin.opToBin(rm, 3);
        rd = ToBin.opToBin(rd, 3);
    }

    @Override
    public String toBin() {
        opToBin();
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());
        res.append(rm);
        res.append(rd);
        return res.toString();
    }

}
