package Traductor;
import Instructions.InstructionClass;

/**
 * This object will translate the assembleur instruction to binary
 * @author Thomas Greaux
 *
 */

public class Translator {

	private InstructionClass IC;
	private Chopper chopper;
	
	/**
	 * Constructor of the Translator, construct an InstructionClass
	 */
	public Translator(){
		IC = new InstructionClass();
	}
	
	/**
	 * Transform an assembleur instruction to binary, readable by the controllor
	 * @param line containing one instruction
	 * @return the instruction in binary
	 * 
	 * TODO: Currently only transform the class of the instruction
	 */
	public String toBin(String line){
        chopper = new Chopper(line);
        String instruct = chopper.getKeyWord(0); //The command is always the 0th element
        String res = IC.to_bin_class(instruct);
		return res;
	}
}
