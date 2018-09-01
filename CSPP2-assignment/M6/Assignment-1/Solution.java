/**
*importing Scanner from java.util.
*/
import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : Siddhartha
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param n Integer.
     */
    static void oddComposites(final int n) {
	// write your code here
        int count = 0;
        for(int i = 3; i <= n; i++) {
                if (i % 2 != 0) {
                    count = 0;
                    for (int j = 3; j < i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                        // System.out.println(i);
                    }
                    if (count > 0) {
                       System.out.println(i); 
                    }
                    // System.out.println(i);
                }
        }
    }
    /**
    * main method as driver program.
    * @param args String is the parameter for this method.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}

