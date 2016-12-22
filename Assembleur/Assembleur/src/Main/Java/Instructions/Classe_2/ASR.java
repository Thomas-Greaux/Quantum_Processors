package Instructions.Classe_2;

import Instructions.Instruction;

public class ASR extends Instruction2{
	String code_op;
	String name;
	boolean reg;
	
	
	public ASR(){
		reg = false;
		code_op = "010";
		name = "ASR";
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
