/**
*Importing Scanner from java.util.
*/
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class Solution {
    /**
    *sol is a constructor.
    */
    private Solution() {
    }
    /**
    *defining main method
    *@param args String.
    */
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
        System.out.println(gcd(n1, n2));
    }
    /*
    Need to write the gcd function and print the output.
    */
    /**
    *a method to compute gcd.
    *@param n1 int
    *@param n2 int
    *@return result 
    */
    public static int gcd(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
            }
        }
        return result;
        // System.out.println(result);
    }
}
