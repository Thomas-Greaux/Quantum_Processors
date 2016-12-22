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
    private String cmd;
    int nb_instructions;
    List<String> key_words;

    public Chopper(String cmd){
        separators = new char[2];
        separators[0] = ' ';
        separators[1] = ',';

        this.cmd = cmd;
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

        for(; r<n; r++){
            if(separator(cmd.charAt(r))){
                key_words.add(cmd.substring(l, r));
                l = r+1; //+1 to not get the separator
            }
        }

        if(l != r) key_words.add(cmd.substring(l, r)); //The last key_word is not necessarily followed by a separator
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

    public static void main(String[] args) {
        Chopper chopper = new Chopper("ADD R1,R2");
        chopper.display();
    }
}
