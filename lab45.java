import java.util.*;
class Account
{
	long acc_no;
	double balance;
	void disp()
	{
		System.out.println("The account number is "+acc_no);
		System.out.println("The account balance is "+balance);
	}
}
class Person extends Account
{
	String name;
	long aadhar_no;
	void disp()
	{
		System.out.println("The name of the person is "+name);
		System.out.println("The account number is "+acc_no);
		System.out.println("The account balance is "+balance);
		System.out.println("The aadhar number is "+aadhar_no);
	}
}
class lab45
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Person arr[]=new Person[5];
		System.out.println("Enter the details for 5 persons");
		for(int i=0;i<5;i++)
		{
			System.out.println("For person "+(i+1));
			arr[i]=new Person();
			System.out.println("Enter the account number of the person");
			arr[i].acc_no=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the name of the person");
			arr[i].name=sc.nextLine();
			System.out.println("Enter the account balance of the person");
			arr[i].balance=sc.nextDouble();
			System.out.println("Enter the aadhar number of the person");
			arr[i].aadhar_no=sc.nextLong();
		}
		System.out.println("The details of 5 persons are");
		for(int i=0;i<5;i++)
			arr[i].disp();
		sc.close();
	}
}