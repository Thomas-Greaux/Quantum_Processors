package Instructions;

import java.util.ArrayList;

public class Sub implements Instruction{
	private String codeop = "01101";
	private String name = "SUB";
	private boolean reg;
	private String rd;
	private String rm;
	private String rn;
	
	public Sub(ArrayList<String> key_words){
		reg = isReg(key_words);
		rd = key_words.get(1);
		rn = key_words.get(2);
		rm = key_words.get(3);
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
        res.append(rm);
        res.append(rn);
        res.append(rd);
        return res.toString();
	}

}
