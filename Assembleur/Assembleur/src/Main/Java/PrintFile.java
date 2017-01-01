import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by GREAUX Thomas on 1/1/2017.
 */
public class PrintFile {
    private PrintWriter printWriter;

    public PrintFile(String file){
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
            System.exit(2);
        }
    }

    public void print(String str){
        printWriter.print(str);
    }

    public void println(String str){
        printWriter.println(str);
    }

    public void flush(){
        printWriter.flush();
    }
}
