import Instructions.*;
import Traductor.Translator;

public class Main {

	public static void main(String[] args) {
        Translator t = new Translator();
        String instruction;
        Instruction res;

        instruction = "ADD R1,R2";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());

        instruction = "ADD R1,#R2";
        res = t.getInstruction(instruction);
        System.out.println(res.toBin());
    }
}
