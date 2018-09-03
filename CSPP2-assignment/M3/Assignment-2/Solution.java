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
    *Fill the main function to print the number of 7's between 1 to number.
    *@param args String.
    */
    public static void main(final String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;
        final int a = 7, b = 10;
        for (int i = 0; i <= number; i++) {
            int temporary = i;
            while (temporary != 0) {
                int storagevalue = temporary % b;
                if (storagevalue == a) {
                    count++;
                }
                temporary = temporary / b;
            }
        }
        System.out.println(count);
    }
}
