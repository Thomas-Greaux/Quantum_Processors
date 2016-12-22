package Instructions.Classe_8;

public class Branch extends Instruction8{
	
	private String code_op;
	private String name;
	private boolean reg;
	
	
	public Branch(){
        reg = false;
        code_op = "111x"; // /!\ il s'agit d'un NOT 111X
		
		name = "B";
	}
	
	public String getCodeOp(){
		return code_op;
	}
	
	public String getName(){
		return name;
	}

    public boolean isReg() {
        return reg;
    }
}
