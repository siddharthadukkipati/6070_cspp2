import java.util.Scanner;
class Area_of_Circle
{
	// public static void main(String[] args)
	// {
	// 	Scanner scan = new Scanner(System.in);
	// 	double pi = 3.14, r, area;
	// 	System.out.println("Enter the radius of the circle");
	// 	r = scan.nextDouble();
	// 	area = pi*r*r;
	// 	System.out.println("Area of the circle is "+area);

	// }
	public static void main (String[] args)
	{
		int radius;
		Scanner scan = new Scanner(System.in);
		radius = scan.nextInt();
		double area_circle = area(radius);
		System.out.println(area_circle);
	}
	public static double pi()
	{
		return 3.14;
	}
	public static double area(int radius)
	{
		return pi()*radius*radius;
	}

} 