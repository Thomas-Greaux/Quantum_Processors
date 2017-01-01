import Instructions.*;
import Traductor.Translator;

public class Main {

	public static void main(String[] args) {
        ReadFile readFile = new ReadFile("./files/in/assembly.txt");
        PrintFile printFile = new PrintFile("./files/out/binary.txt");
        Translator translator = new Translator();
        String line;
        Instruction instruction;
        do{
            line = readFile.read_instruction();
            if(line.equals("exit")) break;
            instruction = translator.getInstruction(line);
            printFile.println(instruction.toBin());
        } while(!line.equals("exit"));
        printFile.flush();
    }
}
