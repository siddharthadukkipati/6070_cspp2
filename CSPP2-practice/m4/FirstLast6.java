/**
*importing Scanner from java.util.
*/
import java.util.Scanner;
// import java.util.Arrays;
/**
*declaring the main class.
*/
class FirstLast6 {
    /**
    *this is a constructor.
    */
    private void firstlast() {
    }
    /**
    *initialising the main method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        final int b = 6;
        final int n = scan.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            a[i] = scan.nextInt();
        }
        if (a[0] == b || a[n - 1] == b) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
    }
}
