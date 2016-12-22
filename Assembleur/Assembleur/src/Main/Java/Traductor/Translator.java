package Traductor;
import Instructions.InstructionClass;

/**
 * This object will translate the assembleur instruction to binary
 * @author Thomas Greaux
 *
 */

public class Translator {
	
	private String current_line;
	private InstructionClass IC;
	
	/**
	 * Constructor of the Translator, construct an InstructionClass
	 */
	public Translator(){
		IC = new InstructionClass();
	}
	
	public String nextWord(){
		StringBuilder res = new StringBuilder();
		int i;
		for(i = 0; i<current_line.length(); i++){
			if(current_line.charAt(i) == ' ') break;
			res.append(current_line.charAt(i));
		}
		
		if(current_line.length() != 0 ) current_line = current_line.substring(i-1, current_line.length()-1);
		else current_line = "";
		
		return res.toString();
	}
	
	/**
	 * Transform an assembleur instruction to binary, readable by the controllor
	 * @param line containing one instruction
	 * @return the instruction in binary
	 * 
	 * TODO: Currently only transform the class of the instruction
	 */
	public String toBin(String line){
		current_line = line;
		String instruct = nextWord();
		String instruct_bin = IC.to_bin_class(instruct);
		return instruct_bin;
	}
}
