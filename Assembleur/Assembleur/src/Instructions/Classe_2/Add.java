package Instructions.Classe_2;

import Instructions.Instruction;

public class Add implements Instruction{
	int code_op[];
	int classe;
	String name;
	
	public Add(){
		code_op = new int[5];
		code_op[0] = 0;
		code_op[1] = 1;
		code_op[2] = 1;
		code_op[3] = 0;
		code_op[4] = 0;
		classe = 2;
		
		name = "ADD";
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