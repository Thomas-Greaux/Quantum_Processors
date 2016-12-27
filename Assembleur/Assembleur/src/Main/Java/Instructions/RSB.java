package Instructions;

import java.util.ArrayList;

/**
 * Created by Thoma on 12/22/2016.
 */
public class RSB implements Instruction{
    private String name = "RSB";
    private boolean reg;
    private String codeop = "1001";
    private String rd;
    private String rn;

    public RSB(ArrayList<String> key_words){
        reg = isReg(key_words);
        rd = key_words.get(1);
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
        res.append(rn);
        res.append(rd);
        return res.toString();
    }

}
