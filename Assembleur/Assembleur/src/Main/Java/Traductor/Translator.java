package Traductor;
import Instructions.Classe_2.Instruction2;
import Instructions.Classe_3.Instruction3;
import Instructions.Classe_5.Instruction5;
import Instructions.Classe_8.Instruction8;
import Instructions.Instruction;

import java.util.ArrayList;

/**
 * This object will translate the assembler instruction to an instruction object, which is able to translate itself
 * @author Thomas Greaux
 *
 */

public class Translator {

	private Chopper chopper;
    private String codeop2;
    private String codeop3;
    private String codeop5;
    private String codeop8;

    private Instruction2[] class2;
    private Instruction3[] class3;
    private Instruction5[] class5;
    private Instruction8[] class8;


    /**
     * Constructor of the Translator, construct an InstructionClass
     */
    public Translator(){

        codeop2 = "00";
        codeop3 = "010000";
        codeop5 = "0101";
        codeop8 = "1101";

        class2 = new Instruction2[7];
        class2[0] = new Instructions.Classe_2.Add(true);
        class2[1] = new Instructions.Classe_2.Add(false);
        class2[2] = new Instructions.Classe_2.ASR();
        class2[3] = new Instructions.Classe_2.LSL();
        class2[4] = new Instructions.Classe_2.LSR();
        class2[5] = new Instructions.Classe_2.Move();
        class2[6] = new Instructions.Classe_2.Sub();

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
     * Returns the Instruction described
     * @param line of the instruction
     * @return the matching Instruction
     */

    public Instruction getInstruction(String line){
        ArrayList<Instruction> instructions = new ArrayList<>(); //List of instructions matching the name
        chopper = new Chopper(line);
        String cmd = chopper.getKeyWord(0); //The command name is always the 0th element

        //Completion of instructions
        for(Instruction instruction : class2){
            if(cmd.equals(instruction.getName())) instructions.add(instruction);
        }

        for(Instruction instruction : class3){
            if(cmd.equals(instruction.getName())) instructions.add(instruction);
        }

        for(Instruction instruction : class5){
            if(cmd.equals(instruction.getName())) instructions.add(instruction);
        }

        for(Instruction instruction : class8){
            if(cmd.equals(instruction.getName())) instructions.add(instruction);
        }

        if(instructions.size() == 1) return instructions.get(0); //If there's no conflict we can return the right instruction

        boolean reg = isReg(line);

        for(Instruction instruction : instructions){
            if(instruction.isReg() == reg) return instruction;
        }

        System.out.println(line + "\nIs not a valid instruction");
        System.exit(1);
        return null;
    }

    private boolean isReg(String line){
        int n = line.length();
        for(int i = 0; i<n; i++){
            if(line.charAt(i) == '#') return false;
        }
        return true;
    }

    public void display(){
        for(Instruction instruction : class2) instruction.display();
        for(Instruction instruction : class3) instruction.display();
        for(Instruction instruction : class5) instruction.display();
        for(Instruction instruction : class8) instruction.display();
    }

}
