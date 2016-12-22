package Instructions.Classe_2;

import Instructions.Instruction;

public class LSL extends Instruction2{
	private String code_op;
	private String name;
	private boolean reg;
	
	
	public LSL(){
		reg = false;
		code_op = "000";
		name = "LSL";
	}
	
	public String getCodeOp(){
		return code_op;
	}
	
	public String getName(){
		return name;
	}

    public boolean isReg() {
        return reg;
    }
}
