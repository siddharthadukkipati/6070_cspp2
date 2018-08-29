/**
*Importing the Scanner class form java.util.
*/
import java.util.Scanner;
/**
*The main class which we initialise SumOfNNumbers.
*/
class SumOfNNumbers {
    /**
    *This is a constructor.
    */
    private void sum() {
    }
    /**
    *This is the main method of the program.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        final int sum = 0;
        // int i = 0;
        for (final int i = 0; i <= n; i += 1) {
            sum = sum + i;
        }
        System.out.println("The sum of N numbers is " + sum);
    }
}
