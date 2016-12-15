package Instructions.Classe_5;

import Instructions.Instruction;

public class Store implements Instruction{ // /!\ A modifier, implementation T2
	
	int op_A[];
	int size_A;
	int op_B[];
	int size_B;
	int classe;
	String name;
	
	
	public Store(){
		op_A = new int[4];
		op_B = new int[3];
		
		op_A[0] = 0;
		op_A[1] = 1;
		op_A[2] = 1;
		op_A[3] = 0;
		
		size_A = 4;
		
		op_B[0] = 0;
		
		size_B = 1;

		classe = 5;
		
		name = "STR";
	}
	
	public int getClasse(){
		return classe;
	}
	
	public String getName(){
		return name;
	}
}