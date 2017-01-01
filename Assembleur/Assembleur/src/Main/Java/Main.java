import Instructions.*;
import Traductor.Translator;

public class Main {

	public static void main(String[] args) {
        Translator t = new Translator();
        String instruction;
        Instruction res;

        instruction = "STR R5,#10111011";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "LDR R5,#10111011";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "STR R6,#10001011";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "LDR R7,#10100011";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());
    }
}
