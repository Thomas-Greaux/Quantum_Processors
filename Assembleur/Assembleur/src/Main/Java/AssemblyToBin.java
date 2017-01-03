import Instructions.Instruction;
import Traductor.Translator;

/**
 * Created by GREAUX Thomas on 1/3/2017.
 */
public class AssemblyToBin {
    private ReadFile readFile;
    private PrintFile printFile;
    Instruction instruction;
    Translator translator = new Translator();

    public AssemblyToBin(){
        readFile = new ReadFile("files/in/assembly.txt");
        printFile = new PrintFile("files/out/binary.txt");
    }

    public void translate(){
        String assembly;
        String bin;

        while(!(assembly = readFile.read_instruction()).equals("exit")){
            instruction = translator.getInstruction(assembly);
            printFile.println(instruction.toBin());
        }
        printFile.flush();

    }

    public static void main(String[] args) {
        BinToHex b = new BinToHex();
        b.translate();
    }
}
