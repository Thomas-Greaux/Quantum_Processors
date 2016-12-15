

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Thomas Greaux
 * A simple class in order to read the file
 *
 */

public class ReadFile {
	BufferedReader reader;
	
	public ReadFile(String file){
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("Could not open the file " + file + "\n");
		}
	}
	
	public String read_instruction(){
		String instruction;
		try {
			instruction = reader.readLine();
		} catch (IOException e) {
			System.out.println("Could not read the next line\n");
			instruction = "exit";
		}
		return instruction;
	}
	
	
}
