import Traductor.Translator;

public class Main {

	public static void main(String[] args) {
		String instruction = "B";
		Translator t = new Translator();
		String res = t.toBin(instruction);
		System.out.println(res);
	}
}