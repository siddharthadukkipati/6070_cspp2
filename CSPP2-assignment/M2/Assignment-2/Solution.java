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
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();
        int ddnumberThree = scan.nextInt();
        roots(numberOne, numberTwo, ddnumberThree);
        // System.out.println(root2);
    }
    /**function to find out the roots of the Quadratic Equation.
    *@param numberOne int
    *@param numberTwo int
    *@param ddnumberThree int
    */
    public static void roots(final int numberOne, final int numberTwo,
        final int ddnumberThree) {
        double result1, result2;
        // if ((numberTwo * numberTwo) - (2 * 2 * numberOne * ddnumberThree) >= 0) {
        double result = Math.sqrt(numberTwo *
            numberTwo - 2 * 2 * numberOne * ddnumberThree);
        result1 = (-numberTwo + result) / (2 * numberOne);
        result2 = (-numberTwo - result) / (2 * numberOne);
        System.out.println(result1 + " " + result2);
        // }
    }
    /*
    Need to write the rootsOfQuadraticEquation function.
    and print the output.
    */
}

