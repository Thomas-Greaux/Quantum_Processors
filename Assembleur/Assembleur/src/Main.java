
public class Main {

	public static void main(String[] args) {
		ROM rom = new ROM("assembleur.txt");
		rom.mod((byte) 1,  47);
		
		rom.mod((byte) 1,  50);
		rom.mod((byte) 1,  51);
		rom.mod((byte) 1,  52);
		rom.mod((byte) 1,  53);
		
		rom.mod((byte) 1,  58);
		
		rom.print();

	}

}
