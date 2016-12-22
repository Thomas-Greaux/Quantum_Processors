package Instructions.Classe_2;

import Instructions.Instruction;

public class Move extends Instruction2{
	int code_op[];
	int size;
	String name;
	
	
	public Move(){
		code_op = new int[5];
		code_op[0] = 1;
		code_op[1] = 0;
		code_op[2] = 0;
		
		size = 3;
		
		name = "MOV";
	}
	
	public int[] getCodeOp(){
		return code_op;
	}
	
	public String getName(){
		return name;
	}
}
