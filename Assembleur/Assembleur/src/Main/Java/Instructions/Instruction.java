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
}
