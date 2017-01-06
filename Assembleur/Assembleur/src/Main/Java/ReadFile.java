import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author GREAUX Thomas
 * A simple class in order to read the file
 *
 */

public class ReadFile {
	private BufferedReader reader;
	private int nb = -1;


	/**
	 * @param file the path of the file
	 */
	public ReadFile(String file){
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("Could not open the file " + file + "\n");
		}
	}

    /**
     * Read a line and returns it
     * If the file ends, it returns "exit"
     * @return the next line in the file
     */
	public String read_instruction(){
		String instruction = null;
		try {
			instruction = reader.readLine();
		} catch (IOException e) {
			System.out.println("Could not read the next line\n");
			System.exit(3);
		}
		if(instruction == null) instruction = "exit";
        nb++;
		return instruction;
	}
	
	public int getNb(){
        return nb;
    }

    public void setNb(int nb){
        this.nb = nb;
    }
}
