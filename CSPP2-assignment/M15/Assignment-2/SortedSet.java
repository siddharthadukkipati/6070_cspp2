import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Exception for signaling set empty errors.
 */
class SetEmptyException extends Exception {
    /**.
     * Constructs the object.
     * @param inputString 
     */
    SetEmptyException(final String inputString) {
        super(inputString);
    }
}
/**.
 * Exception for signaling invalid subset selection errors.
 */
class InvalidSubsetSelectionException extends Exception {
    /**.
     * Constructs the object.
     *
     * @param inputString
     */
    InvalidSubsetSelectionException(final String inputString) {
        super(inputString);
    }
}
/**.
 *This class is for sortedset which performs certains set of operations
 *through which we can perform certain set operations.
 */
public class SortedSet extends Set {
    /**.
     *This method throws the exception, if the set is empty.
     * @return returns the size of the set.
     * @throws SetEmptyException this exception occurs when there is
     * empty set.
     */
    public int last() throws SetEmptyException {
        if (size() == 0) {
            throw new SetEmptyException("Set Empty Exception");
        } else {
            return get(size() - 1);
        }
    }
    /**.
     *This function mainly concentrates on the addition of the
     *elements into the set.
     * @param item item is the element whihc we'd have to add.
     */
    public void add(final int item) {
        if (!contains(item)) {
            int index = getIndex(item);
            add(index, item);
        }
    }
    /**.
     *This getIndex() function mainly works for the indexing and gets the
     *index of the item whihc is a element.
     * @param item item is an element through which the we'd have to check
     *the index for.
     * @return returns the particalr index of that element.
     */
    public int getIndex(final int item) {
        for (int i = 0; i < size(); i++) {
            if (item <= this.get(i)) {
                return i;
            }
        }
        return size();
    }
    /**.
     *To find out the subset of the given set and to return the subset
     *if there is any subset present according to the fromElement and
     *the toElement.
     * @param fromElement is the from element to check from that element.
     * @param toElement is to element to check to that particular element.
     * @return returns the susbest if there is a subset actually present in
     *it else it resturns an exception.
     * @throws     InvalidSubsetSelectionException  { exception_description }
     */
    public int[] subSet(final int fromElement, final int toElement) throws
                                InvalidSubsetSelectionException {
        if (fromElement > toElement) {
            throw new InvalidSubsetSelectionException(
                   "Invalid Arguments to Subset Exception");
        } else {
            int fromIndex = getIndex(fromElement);
            int toindex = getIndex(toElement);
            int[] subset = new int[toindex - fromIndex];
            int k = 0;
            for (int i = fromIndex; i < toindex; i++) {
                subset[k++] = this.get(i);
            }
            return subset;
        }
    }
    /**.
     * { function_description }
     *
     * @param toElement integer data type and to element.
     * @return subSet returns the subset.
     * @throws SetEmptyException throws the exception when the set is empty.
     * @throws InvalidSubsetSelectionException throws when the subset is
     *selection is invalid.
     */
    public int[] headset(final int toElement) throws SetEmptyException,
        InvalidSubsetSelectionException {
           /**.
            * { item_description }
            */
        if (toElement <= this.get(0)) {
            throw new SetEmptyException("Set Empty Exception");
        } else {
            return subSet(get(0), toElement);
        }
    }
    /**.
     * { function_description }
     *
     * @param      inputString     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int[] intArray(final String inputString) {
        String input = inputString;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (inputString.contains("[")) {
            input = inputString.substring(1, inputString.length() - 1);
        }
        return Arrays.stream(input.split(","))
               .mapToInt(Integer::parseInt)
               .toArray();
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        SortedSet inputString = new SortedSet();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(inputString.size());
                break;
            case "contains":
                System.out.println(inputString.
                                   contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(inputString);
                break;
            case "addAll":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    inputString.add(intArray[0]);
                } else {
                    inputString.add(intArray);
                }
                break;
            case "subSet":
                try {
                    String[] arrstring = tokens[1].split(",");
                    int[] subarray =
                    inputString.subSet(Integer.parseInt(arrstring[0]),
                                              Integer.parseInt(arrstring[1]));
                    Set subset = new Set();
                    subset.add(subarray);
                    if (subset != null) {
                        System.out.println(subset);
                    }
                } catch (InvalidSubsetSelectionException e) {
                    System.out.println(e.getMessage());
                }

                break;
            case "headSet":
                try {
                    int[] headarray =
                    inputString.headset(Integer.parseInt(tokens[1]));
                    Set headset = new Set();
                    headset.add(headarray);
                    if (headset != null) {
                        System.out.println(headset);
                    }
                } catch (SetEmptyException se) {
                    System.out.println(se.getMessage());
                } catch (InvalidSubsetSelectionException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "last":
                try {
                    System.out.println(inputString.last());
                } catch (SetEmptyException se) {
                    System.out.println(se.getMessage());
                }
                break;
            case "intersection":
                inputString = new SortedSet();
                SortedSet t = new SortedSet();
                intArray = intArray(tokens[1]);
                inputString.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(inputString.intersection(t));
                break;
            case "retainAll":
                inputString = new SortedSet();
                intArray = intArray(tokens[1]);
                inputString.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(inputString.retainAll(intArray));
                break;
            case "cartesianProduct":
                inputString = new SortedSet();
                t = new SortedSet();
                intArray = intArray(tokens[1]);
                inputString.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println
                (Arrays.deepToString(inputString.cartesianProduct(t)));
                break;

            default:
                break;
            }
        }
    }
}
