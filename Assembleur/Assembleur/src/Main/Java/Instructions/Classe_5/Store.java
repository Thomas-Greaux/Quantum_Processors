package Instructions.Classe_5;

import Instructions.Instruction;

public class Store extends Instruction5{ // /!\ A modifier, implementation T2
	
	int op_A[];
	int size_A;
	int op_B[];
	int size_B;
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
		
		name = "STR";
	}
	
	public String getName(){
		return name;
	}
}
