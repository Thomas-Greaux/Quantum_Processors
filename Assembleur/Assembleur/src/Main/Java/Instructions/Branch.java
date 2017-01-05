package Instructions;

import java.util.ArrayList;

public class Branch implements Instruction{
	
	private String codeop; //NOT 111x
	private String name = "B";
	private boolean reg;
	private String label;
    private String cond;
	
	
	public Branch(ArrayList<String> key_words){
		label = key_words.get(1);
        cond = key_words.get(2);
        if(!cond.equals("1111") && !cond.equals("1110")) codeop = cond;
        else{
            System.out.println("Invalid branching condition: " + cond + "\nMust be NOT 111x");
            System.exit(2);
        }
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

	}

	@Override
	public String toBin() {
        opToBin();
        StringBuilder res = new StringBuilder();
        res.append(categoryToBin());
        res.append(codeopToBin());
        res.append(label);
        return res.toString();
	}
}
