package Instructions.Classe_2;

import Instructions.Instruction;

public class Add extends Instruction2{
	int code_op[];
	String name;
	
	public Add(){
		code_op = new int[5];
		code_op[0] = 0;
		code_op[1] = 1;
		code_op[2] = 1;
		code_op[3] = 0;
		code_op[4] = 0;
		
		name = "ADD";
	}
	
	public int[] getCodeOp(){
		return code_op;
	}
	
	public String getName(){
		return name;
	}
	
}
