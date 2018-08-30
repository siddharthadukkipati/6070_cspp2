/**
*importing Scanner from java.util.
*/
import java.util.Scanner;
/**
*defining the class Solution.
*/
public class Solution {
    /**
    Fill this main function to print maximum of given array.
    */
    /**.
    *defining the constructor.
    */
    private void solution() {
    }
    /**
    *defining the main method
    *@param args String.
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] a = new int[n];
        int max;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
