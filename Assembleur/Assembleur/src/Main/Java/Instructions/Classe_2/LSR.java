package Instructions.Classe_2;

import Instructions.Instruction;

public class LSR implements Instruction{
	int code_op[];
	int classe;
	int size;
	String name;
	
	
	public LSR(){
		code_op = new int[5];
		code_op[0] = 0;
		code_op[1] = 0;
		code_op[2] = 1;
		size = 3;
		classe = 2;
		
		name = "LSR";
	}
	
	public int getClasse(){
		return classe;
	}
	
	public int[] getCodeOp(){
		return code_op;
	}
	
	public String getName(){
		return name;
	}
}
