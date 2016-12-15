import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * 
 * @author Thomas Greaux
 * This class represent a ROM 16x16 bits of data
 * Can print itself
 *
 */

public class ROM {
	private ArrayList<Byte> memory;
	PrintWriter pw;
	private final int WIDTH = 16;
	private final int HEIGHT = 16;
	
	public ROM(){
		memory = new ArrayList<>();
		pw = null;
		for(int i = 0; i < WIDTH; i++){
			for(int j = 0; j < HEIGHT; j++){
				memory.add((byte) 0);
			}
		}
		System.out.println("Memory size: " + memory.size());
	}
	
	public ROM(String file){
		this();
		
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found, will print in terminal :3");
		}
	}
	
	/**
	 * Print the memory in the format of logisim
	 * Print in sys out by default, in a file if it was specified @ the construction
	 */
	
	public void print(){
		ArrayList<Byte> tmp = new ArrayList<>();
		int k = 0;
		
		for(int i = 0; i < HEIGHT; i++){
			for(int j = 0; j < WIDTH; j++, k++){
				if(tmp.isEmpty()) {
					tmp.add(memory.get(k));
				}
				else{
					if(tmp.get(0) == memory.get(k)){ //On continue dans notre lancee
						tmp.add(memory.get(k));
						//System.out.println("tmp 0: " + tmp.get(0) + "  memory k: " + memory.get(k));
					}
					else{                            //La suite est rompue, on l'affiche dans le format logisim
						print_tmp(tmp);
						tmp.clear();
						tmp.add(memory.get(k));
					}
				}
				
			}
		}
		
		if(tmp.get(0) == 1) print_tmp(tmp);
		
		if(pw != null) pw.close();
		
	}
	
	/**
	 * Print a sub part of memory with consecutive 0s or 1s
	 * @param tmp
	 */
		
	private void print_tmp(ArrayList<Byte> tmp){
		String res = to_String(tmp);
		if(pw == null) System.out.print(res);
		else pw.print(res);
	}
	
	/**
	 * Transform a consecutive number of 0s or 1s into logisim format
	 * @param tmp
	 * @return
	 */
	private String to_String(ArrayList<Byte> tmp){
		StringBuilder res = new StringBuilder();
		
		if(tmp.size() > 3) res.append(tmp.size() + "*" + tmp.get(0) + " ");
		else{
			for(int i = 0; i < tmp.size(); i++){
				res.append("" + tmp.get(0) + " ");
			}
		}
		
		return res.toString();
	} 
	
	public void mod(byte x, int i){
		memory.set(i, x);
	}

}
