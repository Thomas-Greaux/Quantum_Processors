package Instructions.Classe_2;

import Instructions.Instruction;

public class Sub extends Instruction2{
	private String code_op;
	private String name;
	private boolean reg;
	
	public Sub(){
		reg = true;
		code_op = "01101";
		name = "SUB";
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
