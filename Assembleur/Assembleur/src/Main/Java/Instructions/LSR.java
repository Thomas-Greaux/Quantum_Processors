package Instructions;

import java.util.ArrayList;

public class LSR implements Instruction{
	public String codeop;
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
			codeop = "001";
			rd = key_words.get(1);
			imm = key_words.get(3);
		}
		else{
			codeop = "0011";
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
        return codeop;
	}

	@Override
	public void opToBin() {
		if(isReg()) {
			rm = ToBin.opToBin(rm, 3);
			rdn = ToBin.opToBin(rdn, 3);
		}
		else {
			rm = ToBin.opToBin(rm, 3);
			rd = ToBin.opToBin(rd, 3);
			imm = imm.substring(1);
		}
	}

	@Override
	public String toBin() {
        opToBin();
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
