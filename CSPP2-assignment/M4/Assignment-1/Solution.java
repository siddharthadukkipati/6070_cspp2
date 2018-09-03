/**
*importing Scanner from java.util.
*/
import java.util.Scanner;
/**
*defining the class Solution.
*/
public class Solution {
    /**
    *defining the constructor.
    */
    private void solution() {
    }
    /**
    *defining the main method.
    *@param args String.
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array size");
        int sizeOfArray = sc.nextInt();
        int[] listOfNumbers = new int[sizeOfArray];
        int max;
        for (int i = 0; i < sizeOfArray; i++) {
            listOfNumbers[i] = sc.nextInt();
        }
        max = listOfNumbers[0];
        for (int i = 0; i < sizeOfArray; i++) {
            if (max < listOfNumbers[i]) {
                max = listOfNumbers[i];
            }
        }
        System.out.println(max);
    }
}
