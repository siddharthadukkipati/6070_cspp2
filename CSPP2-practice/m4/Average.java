/**
*importing Scanner from java.util.
*/
import java.util.Scanner;
/**
*importing Arrays from java.util.
*/
// import java.util.Arrays;
/**
*defining Average class.
*/
class Average {
    /**
    *defining a constructor.
    */
    private void average() {
    }
    /**
    *main method.
    *@param args String.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int sum = 0, avg, n;
        n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            sum += a[i];
        }
        avg = sum / n;
        System.out.println("the average of the elements is " + avg);
    }
}
