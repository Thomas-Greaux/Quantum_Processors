package Instructions.Classe_2;

import Instructions.Instruction;

public class Add extends Instruction2{
	String code_op;
	String name;
    boolean reg;

    /**
     * The constructor needs a boolean to know if it's an imm or reg instruction
     * @param reg
     */
	public Add(boolean reg){
        this.reg = reg;
		if(reg) code_op = "01100";
        else code_op = "01110";
		name = "ADD";
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
