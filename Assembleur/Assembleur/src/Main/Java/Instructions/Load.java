package Instructions;

import java.util.ArrayList;

public class Load implements Instruction{ // /!\ A modifier, implementation T2
	
	private String op_A;
	private String op_B;
	private String name;
	private boolean reg;
	
	
	public Load(ArrayList<String> key_words){
		reg = false;
        op_A = "0110";
        op_B = "1";
		name = "LDR";
	}

	@Override
	public String getCategory() {
		return null;
	}

	public String getName(){
		return name;
	}

    public boolean isReg() {
        return reg;
    }

	@Override
	public String codeopToBin() {
		return null;
	}

	@Override
	public String toBin() {
		return null;
	}

	public String getCodeOp() {
        return "";
    }
}

