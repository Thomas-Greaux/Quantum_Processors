import Instructions.*;
import Traductor.Translator;

public class Main {

	public static void main(String[] args) {
        Translator t = new Translator();
        String instruction;
        Instruction res;

        instruction = "ADD R1,R2,R3";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "ADD R1,R2,#R3";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "LSR R1,R2";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "EOR R1,R2";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "EOR R1,#R2";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "B R1,#R2";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());
    }
}
