package Instructions;

import java.util.ArrayList;

public class Branch implements Instruction{
	
	private String codeop; //NOT 111x
	private String name = "B";
	private boolean reg;
	private String imm;
    private String cond;
	
	
	public Branch(ArrayList<String> key_words){
        cond = key_words.get(1);
        if(!cond.equals("1111") && !cond.equals("1110")) codeop = cond;
        else{
            System.out.println("Invalid branching condition: " + cond + "\nMust be NOT 111x");
            System.exit(2);
        }
		imm = key_words.get(2);
		reg = isReg(key_words);
	}

	@Override
	public String getCategory() {
		return categoryD;
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
        cond = ToBin.opToBin(cond, 4);
		imm = ToBin.opToBin(imm, 8);
	}

	@Override
	public String toBin() {
        opToBin();
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());
        res.append(imm);
        return res.toString();
	}
}
