package Instructions;

import Instructions.Classe_2.*;
import Instructions.Classe_5.*;
import Instructions.Classe_8.*;

/**
 * 
 * @author Thomas Greaux
 * This class determine which kind of instruction we're dealing with
 *
 */

public class InstructionClass {
	
	private String codeop2;
	private String codeop5;
	private String codeop8;
	
	private Instruction[] class2;
	private Instruction[] class5;
	private Instruction[] class8;


	public InstructionClass(){
		
		codeop2 = "00";
		codeop5 = "0101";
		codeop8 = "1101";
		
		class2 = new Instruction[6];
		class2[0] = new Add();
		class2[1] = new ASR();
		class2[2] = new LSL();
		class2[3] = new LSR();
		class2[4] = new Move();
		class2[5] = new Sub();
		
		class5 = new Instruction[2];
		class5[0] = new Load();
		class5[1] = new Store();
		
		class8 = new Instruction[1];
		class8[0] = new Branch();
	}
	
	/**
	 * 
	 * @param cmd the command name in assembler
	 * @return the instruction cmd in binary
	 */
	
	public String to_bin_class(String cmd){
		for(Instruction instruction : class2){
			if(cmd.equals(instruction.getName())) return codeop2;
		}
		
		for(Instruction instruction : class5){
			if(cmd.equals(instruction.getName())) return codeop5;
		}
		
		for(Instruction instruction : class8){
			if(cmd.equals(instruction.getName())) return codeop8;
		}
		
		System.out.println("Error in InstructionClass::to_bin_class, not an instruction: " + cmd);
		System.exit(1);
		return "";
	}
	
	/**
	 * 
	 * @param cmd the command name in assembler
	 * @return the class of the instruction
	 */
	public int classe(String cmd){
		for(Instruction instruction : class2){
			if(cmd.equals(instruction.getName())) return instruction.getClasse();
		}
		
		for(Instruction instruction : class5){
			if(cmd.equals(instruction.getName())) return instruction.getClasse();
		}
		
		for(Instruction instruction : class8){
			if(cmd.equals(instruction.getName())) return instruction.getClasse();
		}
		
		System.out.println("Error in InstructionClass::classe, not an instruction: " + cmd);
		System.exit(1);
		return 1;
	}
}
