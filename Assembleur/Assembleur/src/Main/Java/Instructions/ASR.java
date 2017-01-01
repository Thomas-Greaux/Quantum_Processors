package Instructions;

import java.util.ArrayList;

public class ASR implements Instruction{
	private String codeop;
	private String name = "ASR";
	private boolean reg;
	private String rd;
	private String rm;
	private String imm;
	private String rdn;
	
	
	public ASR(ArrayList<String> key_words){
		reg = isReg(key_words);
		rm = key_words.get(2); //rm is always the second operand
		if(!isReg()) {
            codeop = "010";
			rd = key_words.get(1);
			imm = key_words.get(3);
		}
		else{
            codeop = "0100";
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
        rm = ToBin.opToBin(rm, 3);
		if(isReg()){
            rdn = ToBin.opToBin(rdn, 3);
		}
		else{
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
