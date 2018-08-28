import java.util.Scanner;
class Factorial
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int factorial = fact(n);
      System.out.println("Factorial of "+n+" is: "+factorial);
   }
   public static int fact(int n)
   {
       int result;
       if(n==1 || n==0)
       {
         return 1;
       }
       //Recursion: Function calling itself!!
       result = fact(n-1)* n;
       return result;
   }
}