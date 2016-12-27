package Instructions;

import java.util.ArrayList;

public class LSR implements Instruction{
	private String codeopA = "001";
    private String codeopB = "0011";
	private String name = "LSR";
    private boolean reg;
    private String rd;
    private String rm;
    private String imm;
	private String rdn;
	
	
	public LSR(ArrayList<String> key_words){
		reg = isReg(key_words);
		rm = key_words.get(2); //rm is always the second operand
		if(!isReg()) {
			rd = key_words.get(1);
			imm = key_words.get(3);
		}
		else{
			rdn = key_words.get(1);
		}
	}

	@Override
	public String getCategory() {
		if(!isReg()) return categoryA;
		else return categoryB;
	}

	public String getName(){
		return name;
	}

	public boolean isReg() {
        return reg;
    }

	@Override
	public String codeopToBin() {
        if(!isReg()) return codeopA;
        else return codeopB;
	}

	@Override
	public String toBin() {
		StringBuilder res = new StringBuilder();
		res.append(categoryToBin());
		res.append(codeopToBin());
		if(!isReg()) {
			res.append(imm);
			res.append(rm);
			res.append(rd);
		}
		else{
			res.append(rm);
			res.append(rdn);
		}
		return res.toString();
	}
}
