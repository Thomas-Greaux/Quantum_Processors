package Instructions.Classe_8;

public class Branch extends Instruction8{
	
	int code_op[];
	int size;
	int classe;
	String name;
	
	
	public Branch(){
		code_op = new int[4];
		code_op[0] = 1;
		code_op[1] = 1;
		code_op[2] = 1; // /!\ il s'agit d'un NOT 111X
		size = 3;
		classe = 8;
		
		name = "B";
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
