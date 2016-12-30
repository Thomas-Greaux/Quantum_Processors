package Instructions;

import java.util.ArrayList;

/**
 * Interface of an instruction
 * @author Thomas Greaux
 *
 */
public interface Instruction {
    String categoryA = "A";
    String categoryB = "B";
    String categoryC = "C";
    String categoryD = "D";

    String categoryAbin = "00";
    String categoryBbin = "010000";
    String categoryCbin = "1001";
    String categoryDbin = "1101";

	String getCategory();
	String getName();
	default boolean isReg(ArrayList<String> key_words){
        for(String str : key_words){
            int n = str.length();
            for(int i = 0; i<n; i++){
                if(str.charAt(i) == '#') return false;
            }
        }
        return true;
    }
    boolean isReg();
    default String categoryToBin(){
        String str = getCategory();
        switch(str){
            case categoryA: return categoryAbin;
            case categoryB: return categoryBbin;
            case categoryC: return categoryCbin;
            case categoryD: return categoryDbin;
        }
        System.out.println("Not a category: " + str);
        System.exit(1);
        return "";
    }
    String codeopToBin();
    void opToBin();
	String toBin();
    default void display(){
        System.out.println("Instruction: " + getName());
        System.out.println("\tCategory: " + getCategory());
        System.out.println("\tCode op: " + codeopToBin() + "\n");
    }
}
