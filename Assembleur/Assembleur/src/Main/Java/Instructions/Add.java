package Instructions;

import java.util.ArrayList;

public class Add implements Instruction{
    private String codeop;
    private String name = "ADD";
    private boolean reg;
    private String rd;
    private String rm;
    private String rn;
    private String imm;

    /**
     * The constructor needs a boolean to know if it's an imm or reg instruction
     */
	public Add(ArrayList<String> key_words){
		reg = isReg(key_words);
		rd = key_words.get(1);
		rn = key_words.get(2);
		if(isReg()){
            rm = key_words.get(3);
            codeop = "01100";
        }
        else {
            imm = key_words.get(3);
            codeop = "01110";
        }
	}

	@Override
	public String getCategory() {
		return categoryA;
	}

	public String getName(){
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
        rn = ToBin.opToBin(rn, 3);
        rd = ToBin.opToBin(rd, 3);
        if(isReg())rm = ToBin.opToBin(rm, 3);
        else imm = ToBin.opToBin(imm, 3);
    }

    @Override
	public String toBin() {
        opToBin();
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());

        if(isReg()) res.append(rm);
        else res.append(imm);

        res.append(rn);
        res.append(rd);
        return res.toString();
	}

}
