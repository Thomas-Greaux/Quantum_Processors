public class Main {

	public static void main(String[] args) {
        AssemblyToBin assemblyToBin = new AssemblyToBin();
        BinToHex binToHex = new BinToHex();

        assemblyToBin.translate();
        binToHex.translate();
    }
}
