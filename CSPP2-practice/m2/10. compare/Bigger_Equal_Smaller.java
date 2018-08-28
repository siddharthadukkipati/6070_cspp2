import java.util.Scanner;
import java.util.*;
class Bigger_Equal_Smaller
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	int varA, varB;
	System.out.println("Enter the values of the varA,varB");
	varA = scan.nextInt();
	varB = scan.nextInt();
	if (varA > varB)
		System.out.println("VarA is Bigger");
	else if (varA == varB)
		System.out.println("Both varA and varB are Equal");
	else
		System.out.println("VarA is Smaller");
	}
}