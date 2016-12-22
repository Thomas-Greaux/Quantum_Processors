package Instructions.Classe_2;

import Instructions.Instruction;

public class LSL extends Instruction2{
	int code_op[];
	int size;
	String name;
	
	
	public LSL(){
		code_op = new int[5];
		code_op[0] = 0;
		code_op[1] = 0;
		code_op[2] = 0;
		
		size = 3;
		
		name = "LSL";
	}
	
	public int[] getCodeOp(){
		return code_op;
	}
	
	public String getName(){
		return name;
	}
}
