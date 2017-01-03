/**
 * Created by GREAUX Thomas on 1/3/2017.
 */
public class BinToHex {
    private ReadFile readFile;
    private PrintFile printFile;

    public BinToHex(){
        readFile = new ReadFile("files/out/binary.txt");
        printFile = new PrintFile("files/out/hexa.txt");
    }

    public void translate(){
        String bin;
        int dec;
        String hexa;
        while(!(bin = readFile.read_instruction()).equals("exit")){
            dec = Integer.parseInt(bin, 2);
            hexa = Integer.toString(dec, 16);
            printFile.println(hexa);
        }
        printFile.flush();

    }

    public static void main(String[] args) {
        BinToHex b = new BinToHex();
        b.translate();
    }
}
