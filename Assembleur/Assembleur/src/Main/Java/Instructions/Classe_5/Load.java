package Instructions.Classe_5;

import Instructions.Instruction;

public class Load extends Instruction5{ // /!\ A modifier, implementation T2
	
	private String op_A;
	private String op_B;
	private String name;
	private boolean reg;
	
	
	public Load(){
		reg = false;
        op_A = "0110";
        op_B = "1";
		name = "LDR";
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

