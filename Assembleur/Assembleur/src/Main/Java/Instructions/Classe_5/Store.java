package Instructions.Classe_5;

import Instructions.Instruction;

public class Store extends Instruction5{ // /!\ A modifier, implementation T2
	
	private String op_A;
	private String op_B;
	private String name;
	private boolean reg;
	
	
	public Store(){
		op_A = "0110";
		op_B = "0";
		reg = false;
		name = "STR";
	}
	
	public String getName(){
		return name;
	}

	public boolean isReg() {
		return reg;
	}

    public String getCodeOp() {
        return "";
    }
}
