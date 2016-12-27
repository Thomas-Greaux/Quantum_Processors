package Instructions;

import java.util.ArrayList;

/**
 * Created by Thoma on 12/22/2016.
 */
public class SBC implements Instruction{
    private String name = "SBC";
    private boolean reg;
    private String codeop = "0110";
    private String rdn;
    private String rm;

    public SBC(ArrayList<String> key_words){
        reg = isReg(key_words);
        rdn = key_words.get(1);
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
        res.append(rdn);
        return res.toString();
    }

}
