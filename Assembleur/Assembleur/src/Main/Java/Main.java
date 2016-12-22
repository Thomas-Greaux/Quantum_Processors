import Instructions.*;
import Traductor.Translator;

public class Main {

	public static void main(String[] args) {
        Instruction tmp = new Instructions.Classe_2.LSL();
        System.out.println("Classe de " + tmp.getName() + ": " + tmp.getClasse());
        System.out.println(tmp.getName() + " s'oppere sur un registre: " + tmp.isReg());
        System.out.println("Code de la classe: " + tmp.getCode_classe());
        System.out.println("Code de l'instruction: " + tmp.getCodeOp());

        tmp = new Instructions.Classe_3.LSL();
        System.out.println("Classe de " + tmp.getName() + ": " + tmp.getClasse());
        System.out.println(tmp.getName() + " s'oppere sur un registre: " + tmp.isReg());
        System.out.println("Code de la classe: " + tmp.getCode_classe());
        System.out.println("Code de l'instruction: " + tmp.getCodeOp());

        String instruction = "ADD";
		Translator t = new Translator();
		String res = t.toBin(instruction);
		System.out.println(res);
	}
}
