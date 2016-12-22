package Instructions.Classe_2;

import Instructions.Instruction;

public class Move extends Instruction2{
	private String code_op;
	private String name;
	private boolean reg;
	
	
	public Move(){
        code_op = "100";
        reg = false;
		name = "MOV";
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
