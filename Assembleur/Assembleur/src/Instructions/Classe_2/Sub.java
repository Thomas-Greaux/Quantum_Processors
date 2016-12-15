package Instructions.Classe_2;

import Instructions.Instruction;

public class Sub implements Instruction{
	int code_op[];
	int classe;
	String name;
	
	public Sub(){
		code_op = new int[5];
		code_op[0] = 0;
		code_op[1] = 1;
		code_op[2] = 1;
		code_op[3] = 0;
		code_op[4] = 1;
		classe = 2;
		
		name = "SUB";
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
