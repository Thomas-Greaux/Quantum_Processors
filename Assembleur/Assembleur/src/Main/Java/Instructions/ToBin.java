package Instructions;

/**
 * This class takes an operand and translate it to binary
 * Created by GEAUX Thomas on 12/28/2016.
 */
public class ToBin {

    //TODO: exception si il n'y a pas assez de bits pour encoder

    /**
     * Code the operand in binary, using n bytes (more if necessary)
     * @param operand
     * @param n
     * @return
     */
    public static String opToBin(String operand, int n){
        int reg = opToInt(operand);
        String res = intToBin(reg, n);
        return res;
    }

    /**
     * Transform an operand (String) to int
     */
    private static int opToInt(String operand){
        String res = operand;
        while(res.charAt(0) > 58 || res.charAt(0) < 47){
            res = res.substring(1);
        }

        return Integer.parseInt(res);
    }

    /**
     * @param i the number to write in binary
     * @param n the number of byte to use (must be greater than required or it is ignored)
     * @return i in binary (String)
     */
    private static String intToBin(int i, int n){
        StringBuilder res = new StringBuilder();
        while(i != 0){
            if(i%2 == 0) res.append("0");
            else res.append("1");
            i /= 2;
        }
        res.reverse();
        while(res.length() < n) res.insert(0, '0');
        return res.toString();
    }

    public static void main(String[] args) {
        ToBin t = new ToBin();
        System.out.println(t.opToBin("1100", 4));
    }
}
