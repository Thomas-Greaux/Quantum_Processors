

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
	BufferedReader reader;

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
	
	public String read_instruction(){
		String instruction = null;
		try {
			instruction = reader.readLine();
		} catch (IOException e) {
			System.out.println("Could not read the next line\n");
			System.exit(3);
		}
		if(instruction == null) instruction = "exit";
		return instruction;
	}
	
	
}
