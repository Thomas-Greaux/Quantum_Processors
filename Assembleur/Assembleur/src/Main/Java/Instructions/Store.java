package Instructions;

import java.util.ArrayList;

public class Store implements Instruction{ // /!\ A modifier, implementation T2

	private String codeop = "0";
	private String name;
	private boolean reg;

	private String rt;
	private String imm;


	public Store(ArrayList<String> key_words){
		reg = isReg(key_words);
		name = "LDR";
		rt = key_words.get(1);
		imm = key_words.get(2);
	}

	@Override
	public String getCategory() {
		return categoryC;
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
		rt = ToBin.opToBin(rt, 3);
	}

	@Override
	public String toBin() {
		opToBin();
		StringBuilder res = new StringBuilder();
		res.append(categoryToBin());
		res.append(codeopToBin());
		res.append(rt);
		res.append(imm);
		return res.toString();
	}
}
