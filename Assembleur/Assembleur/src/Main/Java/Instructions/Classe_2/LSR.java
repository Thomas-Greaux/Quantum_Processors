package Instructions.Classe_2;

import Instructions.Instruction;

public class LSR extends Instruction2{
	private String code_op;
	private String name;
    private boolean reg;
	
	
	public LSR(){
        reg = false;
		code_op = "001";
		name = "LSR";
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
