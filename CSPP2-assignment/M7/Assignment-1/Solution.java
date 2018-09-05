/**
 *importing Scanner from java.util
 */
import java.util.Scanner;
/**
 * class declaration.
 **/
    final class InputValidator {
        /**.
        *Declaring a string.
        */
        private String stringCheck;
        /**.
        *Declaring string length.
        */
        private int length;
        /**
         * @param strCheck1 string input.
         **/
        InputValidator(final String strCheck1) {
            stringCheck = strCheck1;
            length = stringCheck.length();
        }
        /**
         * @return true or false.
         **/
        public boolean validateData() {
        final int b = 6;
        if (length >= b) {
          return true;
        }
        return false;
    }
}
/**
 main class function.
 **/
final class Solution {
    /**
     constructor.
     **/
    private Solution() { }
    /**.
     * @param args input string.
     **/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator objI = new InputValidator(input);
        System.out.println(objI.validateData());
    }
}