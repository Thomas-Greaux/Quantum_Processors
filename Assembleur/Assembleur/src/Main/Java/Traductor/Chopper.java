package Traductor;

import java.util.ArrayList;
import java.util.List;

/**
 * This class chop an line into the different key words
 * also gives the number of operands to differentiate imm and reg instructions
 * Created by Thoma on 12/22/2016.
 */
public class Chopper {
    private char[] separators;
    int nb_instructions;
    ArrayList<String> key_words;

    public Chopper(String cmd){
        separators = new char[3];
        separators[0] = ' ';
        separators[1] = ',';
        separators[2] = '\t';

        key_words = new ArrayList<String>();

        chop(cmd);
        nb_instructions = key_words.size();
    }

    /**
     * Chop the instruction into the key_words
     * called only when constructing an object
     * @param cmd the instruction
     */

    private void chop(String cmd){
        int n = cmd.length();
        //l and r will be used to chop the string
        int l = 0;
        int r = 0;

        for(; l<n; l++){
            if(separator(cmd.charAt(l))) {
                for (r = l; r < n; r++) {
                    if (!separator(cmd.charAt(r))) break;
                }
                r--;
                l = r;
            }
            else {
                for (r = l; r < n; r++) {
                    if (separator(cmd.charAt(r))) break;
                }
                key_words.add(cmd.substring(l, r));
                l = r;
            }

        }

        suffix();
    }

    /**
     * handle the suffix of the instruction (ie ADDS / ADD<c>)
     */
    private void suffix(){
        String instruction = key_words.get(0);
        if(instruction.charAt(0) == 'B'){
            if(instruction.length() == 1) key_words.add("AL");
            else{
                key_words.add(instruction.substring(1));
                key_words.set(0, "B");
            }
        }
        else{
            if(instruction.length() > 3){
                key_words.add(instruction.substring(3));
                key_words.set(0, instruction.substring(0,3));
            }
        }
    }

    /**
     * Determine if a character is or not a separator
     * @param c the character
     * @return true or false
     */
    private boolean separator(char c){
        int n = separators.length;
        for(char s : separators){
            if(s == c) return true;
        }
        return false;
    }

    /**
     * Display the number of key_words and said key_words
     */
    public void display(){
        int n = nb_instructions;
        System.out.println("There are " + n + " key_words");
        for(int i = 0; i<n;i++){
            System.out.println("\tKey_word " + (i+1) + ": " + key_words.get(i));
        }
    }

    /**
     * @param i the key_word desired
     * @return the ith key_word
     */
    public String getKeyWord(int i){
        return key_words.get(i);
    }

    /**
     * @return all the key_words in a list
     */
    public ArrayList<String> getKeyWords(){
        return key_words;
    }

    /**
     * For try purposes
     * @param args
     */
    public static void main(String[] args) {
        Chopper chopper;
        chopper = new Chopper("  ADD \t  R1, ,R2,R3\t");
        chopper.display();
    }
}
