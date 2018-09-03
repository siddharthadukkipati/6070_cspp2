import java.util.Scanner;
class Student{
	public Student(String name,String rollno, Double subject1, Double subject2, Double subject3){
		String nameOfStudent = name;
		String rollNumber = rollno;
		Double s1 = subject1;
		Double s2 = subject2;
		Double s3 = subject3;
		System.out.println("average is" + ((s1+s2+s3)/3));
	}

}
public class StudentDetails{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String rollnum = scan.nextLine();
		Double s1 = scan.nextDouble();
		Double s2 = scan.nextDouble();
		Double s3 = scan.nextDouble();
		Student st = new Student(name,rollnum,s1,s2,s3);
	}
}