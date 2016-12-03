package Instructions;

import java.util.ArrayList;

/**
 * 
 * @author Thomas Greaux
 * This class determine which can of instruction we're dealing with
 *
 */

public class InstructionClass {
	private ArrayList<String> class2;
	private int codeop2[];
	
	private ArrayList<String> class5;
	private int codeop5[];
	
	private ArrayList<String> class8;
	private int codeop8[];
	
	public InstructionClass(){
		//Initialization of class2
		class2.add("LSL");
		class2.add("LSR");
		class2.add("ASR");
		class2.add("ADD"); //TODO make the distinction between imm and reg
		class2.add("SUB");
		class2.add("ADD");
		class2.add("MOV");
		
		codeop2 = new int[2];
		codeop2[0] = 0;
		codeop2[1] = 0;
		
		//Initialization of class5
		class5.add("STR");
		class5.add("LDR");
		
		codeop5 = new int[4];
		codeop5[0] = 0;
		codeop5[1] = 1;
		codeop5[2] = 0;
		codeop5[3] = 1;
		
		//Initialization of class5
		class8.add("B");
		
		codeop8 = new int[4];
		codeop8[0] = 1;
		codeop8[1] = 1;
		codeop8[2] = 0;
		codeop8[3] = 1;
	}
}
