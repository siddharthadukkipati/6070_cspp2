/*
importing the scanner.
*/
import java.util.Scanner;
// import static java.lang.Math.sqrt;
/**
*the program is to find the roots.
*/
public final class Solution {
    /**
    *the program is to find the roots.
    */
    private Solution() {
    }
    /**
    Do not modify this main function.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
        // System.out.println(root2);
    }
    /*function to find out the roots of the Quadratic Equation.
    */
    public static void roots(final int a, final int b, final int c) {
        double result1, result2;
        // if ((b * b) - (2 * 2 * a * c) >= 0) {
        result1 = -b + Math.sqrt(b * b - (2 * 2 * a * c));
        result2 = -b - Math.sqrt(b * b - (2 * 2 * a * c));
        System.out.println(result1 / 2 * a + " " + result2 / 2 * a);
        // }
    }
    /*
    Need to write the rootsOfQuadraticEquation function.
    and print the output.
    */
}
