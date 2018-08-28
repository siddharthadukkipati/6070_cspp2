import java.util.Scanner;

public final class Solution {
	/*
	Do not modify this main function.
	*/
	private Solution() {
	/* this is a constructor.
    */
	}
	public static void main(final String[] args) {
		Scanner s=new Scanner(System.in);      
        long base = s.nextInt();
        long exponent = s.nextInt();
        long result=power(base, exponent);
        System.out.println(result);
	}
	/*
	Need to write the power function and print the output.
	*/
	public static long power(long base, long exponent) {
		if (exponent==0)
			return 1;
		else
			return base * power(base,exponent-1);

	}
}
