package Instructions;

import java.util.ArrayList;

/**
 * Created by Thoma on 12/22/2016.
 */
public class TST implements Instruction{
    private String name = "TST";
    private boolean reg;
    private String codeop = "1000";
    private String rn;
    private String rm;

    public TST(ArrayList<String> key_words){
        reg = isReg(key_words);
        rn = key_words.get(1);
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
    public String toBin() {
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());
        res.append(rm);
        res.append(rn);
        return res.toString();
    }
}
