import java.util.*;
abstract class student1
{
	long roll_no,reg_no;
	abstract void course();
}
class kiitian extends student1
{
	String course_no;
	void course()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll number");
		roll_no=sc.nextLong();
		System.out.println("Enter the registration number");
		reg_no=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the course number");
		course_no=sc.nextLine();
		sc.close();
	}
	void disp()
	{
		System.out.println("The roll number is "+roll_no);
		System.out.println("The registration number is "+reg_no);
		System.out.println("The course number is "+course_no);
	}
}
class Q1
{
	public static void main(String[] args)
	{
		kiitian obj=new kiitian();
		obj.course();
		obj.disp();
	}
}