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
        int rows1 = scan.nextInt();
        int columns1 = scan.nextInt();
        int[][] matrixOne = new int[rows1][columns1];
        int[][] rows = new int[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixOne[i][j] = scan.nextInt();
            }
        }
        int rows2 = scan.nextInt();
        int columns2 = scan.nextInt();
        int[][] matrixTwo = new int[rows2][columns2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrixTwo[i][j] = scan.nextInt();
            }
        }
        if (rows1 == rows2 && columns1 == columns2) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1 - 1; j++) {
                    rows[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                    System.out.print(rows[i][j] + " ");
                }
                rows[i][columns1 - 1] = matrixOne[i][columns1 - 1] +
                matrixTwo[i][columns2 - 1];
                System.out.println(rows[i][columns1 - 1]);
            }
        } else {
            System.out.println("not possible");
        }
    }
}
