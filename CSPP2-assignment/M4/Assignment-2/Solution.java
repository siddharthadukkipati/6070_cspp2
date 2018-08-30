/**
*importing Scanner form java.util.
*/
import java.util.Scanner;
/**
*implementing Solution class.
*/
public class Solution {
	/**
	Fill the main function to print resultant of addition of matrices.
	*/
	private void solution() {
	}
	/**
	*defining main menthod.
	*@param args String.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row1 = scan.nextInt();
		int col1 = scan.nextInt();
		int[][] matrix_1 = new int[row1][col1];
		for (int i = 0; i < row1 - 1; i++) {
			for (int j = 0; j < col1 - 1; j++) {
				matrix_1[i][j] = scan.nextInt(); 
			}
		}
		int row2 = scan.nextInt();
		int col2 = scan.nextInt();
		int[][] matrix_2 = new int[row2][col2];
		for (int i = 0; i < row2 - 1; i++) {
			for (int j = 0; j < col2 - 1; j++) {
				matrix_2[i][j] = scan.nextInt(); 
			}
		}
		if (row1 == row2 && col1 == col2) {
			int[][] result = new int[row1][col1]; 
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					result[i][j] = matrix_1[i][j] + matrix_2[i][j];	
					System.out.println(result[i][j] + " ");		
				}
				result[i][col1 - 1] = matrix_1[i][col1 - 1] + matrix_2[i][col2 - 1];
				System.out.println(result[i][col1 - 1]);
			}
		}
		else{
			System.out.println("not possible");
		}
			
	}
}