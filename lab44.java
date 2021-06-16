import java.util.*;
class Shape
{
	double area;
	void showArea()
	{
		System.out.println("The area is "+area);
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double r)
	{
		radius=r;
	}
	void calc()
	{
		area=3.14*radius*radius;
		showArea();
	}
}
class Rectangle extends Shape
{
	double length,width;
	Rectangle(double a,double b)
	{
		length=a;
		width=b;
	}
	void calc()
	{
		area=length*width;
		showArea();
	}
}
class lab44
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double r;
		System.out.println("Enter the radius of circle");
		r=sc.nextDouble();
		Circle obj1=new Circle(r);
		obj1.calc();
		double a,b;
		System.out.println("Enter the length and breadth of rectangle");
		a=sc.nextDouble();
		b=sc.nextDouble();
		Rectangle obj2=new Rectangle(a,b);
		obj2.calc();
		sc.close();
	}
}