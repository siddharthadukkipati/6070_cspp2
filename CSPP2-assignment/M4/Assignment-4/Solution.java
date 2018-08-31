
// Given an String, Write a java method that returns the decimal value for the given binary string.

/**
*importing Scanner from java.util.
*/
import java.util.Scanner;
/**
*Implementing Soultion class.
*/
public class Solution {
    /**
    *declaring a default constructor.
    */
    private void solution() {
    }
    /**
    *Do not modify the main function.
    *@param args String.
    */
    public static void main(final String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
    *Implementing a function for reverse of a string.
    *@param s String.
    *@return reverse. 
    */
    public static String reverseString(String s) {
        int a = s.length() - 1;
        // System.out.println(a);
        String reverse = "";
        for (int i = a; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        // for (int i = 0; i <= s.length() - 1; i++) {
        //  reverse = s.charAt(i) + reverse;
        // }
        return reverse;
    }
}
