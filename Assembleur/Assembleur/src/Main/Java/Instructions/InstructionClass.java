package Instructions;

import Instructions.Classe_2.*;
import Instructions.Classe_2.ASR;
import Instructions.Classe_2.LSL;
import Instructions.Classe_2.LSR;
import Instructions.Classe_3.*;
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
	private String codeop3;
	private String codeop5;
	private String codeop8;
	
	private Instruction2[] class2;
    private Instruction3[] class3;
	private Instruction5[] class5;
	private Instruction8[] class8;


	public InstructionClass(){
		
		codeop2 = "00";
        codeop3 = "010000";
		codeop5 = "0101";
		codeop8 = "1101";
		
		class2 = new Instruction2[6];
		class2[0] = new Instructions.Classe_2.Add();
		class2[1] = new Instructions.Classe_2.ASR();
		class2[2] = new Instructions.Classe_2.LSL();
		class2[3] = new Instructions.Classe_2.LSR();
		class2[4] = new Instructions.Classe_2.Move();
		class2[5] = new Instructions.Classe_2.Sub();

        class3 = new Instruction3[16];
        class3[0] = new Instructions.Classe_3.ADC();
        class3[1] = new Instructions.Classe_3.AND();
        class3[2] = new Instructions.Classe_3.ASR();
        class3[3] = new Instructions.Classe_3.BIC();
        class3[4] = new Instructions.Classe_3.CMN();
        class3[5] = new Instructions.Classe_3.CMP();
        class3[6] = new Instructions.Classe_3.EOR();
        class3[7] = new Instructions.Classe_3.LSL();
        class3[8] = new Instructions.Classe_3.LSR();
        class3[9] = new Instructions.Classe_3.MUL();
        class3[10] = new Instructions.Classe_3.MVN();
        class3[11] = new Instructions.Classe_3.ORR();
        class3[12] = new Instructions.Classe_3.ROR();
        class3[13] = new Instructions.Classe_3.RSB();
        class3[14] = new Instructions.Classe_3.SBC();
        class3[15] = new Instructions.Classe_3.TST();
		
		class5 = new Instruction5[2];
		class5[0] = new Instructions.Classe_5.Load();
		class5[1] = new Instructions.Classe_5.Store();
		
		class8 = new Instruction8[1];
		class8[0] = new Instructions.Classe_8.Branch();
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

        for(Instruction instruction : class3){
            if(cmd.equals(instruction.getName())) return codeop3;
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
