/**
*importing Scanner foem java.util.
*/
import java.util.Scanner;
/**
*implementing Soultion class.
*/
public class Solution {
    /**
    *declaring a default constructor.
    */
    private void solution() {
    }
    /**
    *Do not modify this main function.
    *@param args String.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String inpstring = scan.next();
            int resultantstring = binaryToDecimal(inpstring);
            System.out.println(resultantstring);
        }
    }
    /**
    *Method for binary to decimal conversion.
    *@param inpstring String.
    *@return resultantstring int.
    */
    public static int binaryToDecimal(final String inpstring) {
        double resultantstring = 0;
        for (int i = 0; i < inpstring.length(); i++) {
            if (inpstring.charAt(i) == '1') {
                resultantstring = resultantstring
                + Math.pow(2, inpstring.length() - 1 - i);
            }
        }
        return (int) resultantstring;
    }
}
