package Instructions.Classe_2;

import Instructions.Instruction;

public class ASR extends Instruction2{
	int code_op[];
	int size;
	String name;
	
	
	public ASR(){
		code_op = new int[5];
		code_op[0] = 0;
		code_op[1] = 1;
		code_op[2] = 0;
		size = 3;
		
		name = "ASR";
	}
	
	public int[] getCodeOp(){
		return code_op;
	}
	
	public String getName(){
		return name;
	}
}
