/**
*importing the Scanner class.
*/
import java.util.Scanner;
/**
*the program is about finding the suqre root using.
*the recursive function.
*/
public final class Solution {
    /**
    *this is a constructor.
    */
    private Solution() {
    }
    /**
    *declaring the main function.
    *where we call the power function.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        final long base = s.nextInt();
        final long exponent = s.nextInt();
        final long result = power(base, exponent);
        System.out.println(result);
    }
    /**
    *Need to write the power function and print the output.
    *@param base long.
    *@param exponent long.
    *@return power value.
    */
    public static long power(final long base, final long exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}

