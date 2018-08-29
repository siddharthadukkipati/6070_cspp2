/**
*Importing Scanner from java.util method.
*/
import java.util.Scanner;
    /**
    Do not modify this main function.
    */
public class Solution {
    /**
    *sol is a constructor.
    */
    private void sol() {
        }
    /**
    *Fill the main function to print the number of 7's between 1 to n.
    *@param args String.
    */
    public static void main(final String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        final int a = 7, b = 10;
        for (int i = 0; i <= n; i++) {
            // int div = i % 10;
            // int div1 = i / 10;
            // if (div == 7) {
            //  count++;
            // }
            // if (div == 7) {
            //  count1++;
            // }
            int temp = i;
            while (temp != 0) {
                int k = temp % b;
                if (k == a) {
                    count++;
                }
                temp = temp / b;
            }
        }
        System.out.println(count);
    }
}
