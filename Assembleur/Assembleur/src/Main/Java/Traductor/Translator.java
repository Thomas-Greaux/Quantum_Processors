package Traductor;
import Instructions.Add;
import Instructions.*;

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

    private String[] instructions;


    /**
     * Constructor of the Translator, construct an InstructionClass
     */
    public Translator(){

        codeop2 = "00";
        codeop3 = "010000";
        codeop5 = "0101";
        codeop8 = "1101";

        instructions = new String[25];
        instructions[0] = "ADD";
        instructions[1] = "ASR";
        instructions[2] = "LSL";
        instructions[3] = "LSR";
        instructions[4] = "MOV";
        instructions[5] = "SUB";
        instructions[6] = "ADC";
        instructions[7] = "AND";
        instructions[8] = "ASR";
        instructions[9] = "BIC";
        instructions[10] = "CMN";
        instructions[11] = "CMP";
        instructions[12] = "EOR";
        instructions[13] = "LSL";
        instructions[14] = "LSR";
        instructions[15] = "MUL";
        instructions[16] = "MVN";
        instructions[17] = "ORR";
        instructions[18] = "ROR";
        instructions[19] = "RSB";
        instructions[20] = "SBC";
        instructions[21] = "TST";
        instructions[22] = "LDR";
        instructions[23] = "STR";
        instructions[24] = "B";
    }

    /**
     * Returns the Instruction described
     * @param line of the instruction
     * @return the matching Instruction
     */

    public Instruction getInstruction(String line){
        chopper = new Chopper(line);
        String cmd = chopper.getKeyWord(0); //The command name is always the 0th element

        int n =instructions.length;
        for(int i = 0; i<n; i++){
            if(cmd.equals(instructions[i])){
                switch (i){
                    case 0: return new Add(chopper.getKeyWords());
                    case 1: return new ASR(chopper.getKeyWords());
                    case 2: return new LSL(chopper.getKeyWords());
                    case 3: return new LSR(chopper.getKeyWords());
                    case 4: return new Move(chopper.getKeyWords());
                    case 5: return new Sub(chopper.getKeyWords());
                    case 6: return new ADC(chopper.getKeyWords());
                    case 7: return new AND(chopper.getKeyWords());
                    case 8: return new ASR(chopper.getKeyWords());
                    case 9: return new BIC(chopper.getKeyWords());
                    case 10: return new CMN(chopper.getKeyWords());
                    case 11: return new CMP(chopper.getKeyWords());
                    case 12: return new EOR(chopper.getKeyWords());
                    case 13: return new LSL(chopper.getKeyWords());
                    case 14: return new LSR(chopper.getKeyWords());
                    case 15: return new MUL(chopper.getKeyWords());
                    case 16: return new MVN(chopper.getKeyWords());
                    case 17: return new ORR(chopper.getKeyWords());
                    case 18: return new ROR(chopper.getKeyWords());
                    case 19: return new RSB(chopper.getKeyWords());
                    case 20: return new SBC(chopper.getKeyWords());
                    case 21: return new TST(chopper.getKeyWords());
                    case 22: return new Load(chopper.getKeyWords());
                    case 23: return new Store(chopper.getKeyWords());
                    case 24: return new Branch(chopper.getKeyWords());

                }
            }
        }

        System.out.println(line + "\nIs not a valid instruction");
        System.exit(1);
        return null;
    }
}
