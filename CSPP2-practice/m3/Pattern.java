/**
*Importing the Scanner class form java.util.
*/
import java.util.Scanner;
/**
*initialising the main class.
*/
class Pattern {
    /**
    *this is a constructor.
    */
    private void pat() {
    }
    /**
    *initialisng the main method.
    *@param args String.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            // System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
