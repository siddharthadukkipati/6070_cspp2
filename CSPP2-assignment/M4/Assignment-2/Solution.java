/**
*importing Scanner form java.util.
*/
import java.util.Scanner;
/**
*implementing Solution class.
*/
public final class Solution {
    /**
    Fill the main function to print resultant of addition of matrices.
    */
    private void solution() {
    }
    /**
    *defining main menthod.
    *@param args String.
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int[][] m1 = new int[r1][c1];
        int[][] r = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int[][] m2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = scan.nextInt();
            }
        }
        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1 - 1; j++) {
                    r[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(r[i][j] + " ");
                }
                r[i][c1 - 1] = m1[i][c1 - 1] + m2[i][c2 - 1];
                System.out.println(r[i][c1 - 1]);
            }
        } else {
            System.out.println("not possible");
        }
    }
}