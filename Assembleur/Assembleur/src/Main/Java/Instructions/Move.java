package Instructions;

import java.util.ArrayList;

public class Move implements Instruction{
	private String codeop = "100";
	private String name = "MOV";
	private boolean reg;
	private String rd;
	private String imm;
	
	
	public Move(ArrayList<String> key_words){
        reg = isReg(key_words);
        rd = key_words.get(1);
        imm = key_words.get(2);
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
	public String toBin() {
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());
        res.append(imm);
        res.append(rd);
        return res.toString();
	}
}
