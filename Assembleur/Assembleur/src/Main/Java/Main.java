import Instructions.*;
import Traductor.Translator;

public class Main {

	public static void main(String[] args) {
        ReadFile readFile = new ReadFile("./files/in/assembly.txt");
        Translator translator = new Translator();
        String line;
        Instruction instruction;
        while(!(line = readFile.read_instruction()).equals("exit")){
            instruction = translator.getInstruction(line);
            System.out.println(instruction.toBin());
        }
    }
}
