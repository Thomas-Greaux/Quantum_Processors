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
		memory = new ArrayList<>();
		pw = null;
		for(int i = 0; i < WIDTH; i++){
			for(int j = 0; j < HEIGHT; j++){
				memory.add((byte) 0);
			}
		}
		System.out.println("Memory size: " + memory.size());
		
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found, will print in terminal :3");
		}
	}
	
	public void print(){
		ArrayList<Byte> tmp = new ArrayList<>();
		int k = 0;
		
		for(int i = 0; i < HEIGHT; i++){
			for(int j = 0; j < WIDTH; j++, k++){
				if(tmp.isEmpty()) {
					tmp.add(memory.get(k));
				}
				else{
					if(tmp.get(0) == memory.get(k)){
						tmp.add(memory.get(k));
						//System.out.println("tmp 0: " + tmp.get(0) + "  memory k: " + memory.get(k));
					}
					else{
						print_tmp(tmp);
						tmp.clear();
						tmp.add(memory.get(k));
					}
				}
				
			}
		}
		
		if (tmp.get(0) == 1) print_tmp(tmp);
		
	}
		
	private void print_tmp(ArrayList<Byte> tmp){
		if(tmp.size() > 3) System.out.print(tmp.size() + "*" + tmp.get(0) + " ");
		else{
			for(int i = 0; i < tmp.size(); i++){
				if(pw == null) System.out.print("" + tmp.get(0) + " ");
				else pw.print("" + tmp.get(0) + " ");
			}
		}
	}
	
	public void mod(byte x, int i){
		memory.set(i, x);
	}

}
