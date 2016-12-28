package Instructions;

import java.util.ArrayList;

/**
 * Created by GREAUX Thomas on 12/22/2016.
 */
public class ADC implements Instruction{
    private String name = "ADC";
    private boolean reg;
    private String codeop = "0101";
    private String rdn;
    private String rm;

    public ADC(ArrayList<String> key_words){
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
    public void opToBin() {
        rdn = ToBin.opToBin(rdn, 3);
        rm = ToBin.opToBin(rm, 3);
    }

    @Override
    public String toBin() {
        opToBin();
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());
        res.append(rm);
        res.append(rdn);
        return res.toString();
    }

}
