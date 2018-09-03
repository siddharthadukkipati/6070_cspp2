/**
*Importing Scanner from java.util.
*/
import java.util.Scanner;
    /**
    Do not modify this main function.
    */
public final class Solution {
    /**
    *sol is a constructor.
    */
    private Solution() {
    }
    /**
    *defining main method.
    *@param args String.
    */
    public static void main(final String[] args) {

        Scanner inpstring = new Scanner(System.in);
        int number1 = inpstring.nextInt();
        int number2 = inpstring.nextInt();
        gcd(number1, number2);
        System.out.println(gcd(number1, number2));
    }
    /*
    Need to write the gcd function and print the output.
    */
    /**
    *a method to compute gcd.
    *@param number1 int
    *@param number2 int
    *@return result
    */
    public static int gcd(final int number1, final int number2) {
        int result = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                result = i;
            }
        }
        return result;
        // System.out.println(result);
    }
}
