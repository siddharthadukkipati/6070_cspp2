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
    *Do not modify this main function.
    */
    private Solution() {
    /**
    *this is a constructor.
    */
    }
    /**
    *declaring the main function.
    *where we call the power function.
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
    */
    public static long power(final long base, final long exponent) {
        if (exponent == 0) {
            return 1;
        }
        else {
            return base * power(base, exponent - 1);
        }
    }
}
