package Instructions;

/**
 * Interface of an instruction
 * @author Thomas Greaux
 *
 */
public interface Instruction {
	int getClasse();
	String getName();
	boolean isReg();
    String getCode_classe();
    String getCodeOp();
	default String toBin(){return getCode_classe() + getCodeOp();}
    default void display(){
        System.out.println("Instruction: " + getName());
        System.out.println("\tClasse: " + getClasse());
        System.out.println("\tCode Classe: " + getCode_classe());
        System.out.println("\tCode op: " + getCodeOp() + "\n");
    }
}
