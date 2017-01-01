package Instructions;

import java.util.ArrayList;

public class Load implements Instruction{

	private String codeop = "1";
	private String name;
	private boolean reg;

    private String rt;
    private String imm;
	
	
	public Load(ArrayList<String> key_words){
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
		imm = imm.substring(1);
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

