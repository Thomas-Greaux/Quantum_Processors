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

        while(!(assembly = readFile.read_instruction()).equals("exit")){
            if(assembly.charAt(assembly.length()-1) == ':') { //Si il s'agit d'un label, on l'enregistre et decremente l'addresse d'instruction
                int num = readFile.getNb();
                translator.setLabel(assembly.substring(0, assembly.length()-1), num);
                readFile.setNb(num-1);
            }
            else {
                instruction = translator.getInstruction(assembly); //Sinon, il s'agit d'une instruction
                printFile.println(instruction.toBin());
            }
        }
        printFile.flush();

    }

    public static void main(String[] args) {
        String test = "Ceci est un test";
        System.out.println(test.substring(0, test.length()-1));
    }
}
