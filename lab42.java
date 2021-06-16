import java.util.*;
class plate
{
	double length,width;
	plate(double a,double b)
	{
		System.out.println("Inside constructor of plate");
		length=a;
		width=b;
	}
	double calc()
	{
		return length*width;
	}
}
class box extends plate
{
	double height;
	box(double a,double b,double c)
	{
		super(a,b);
		System.out.println("Inside constructor of box");
		height=c;
	}
	double calc()
	{
		return super.calc()*height;
	}
}
class woodbox extends box
{
	double thick;
	woodbox(double a,double b,double c,double d)
	{
		super(a,b,c);
		System.out.println("Inside constructor of woodbox");
		thick=d;
	}
	double calc()
	{
		double vol=super.calc()-((length-2*thick)*(width-2*thick)*height-(2*thick));
		return vol;
	}
}
class Q2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double dim1,dim2,dim3,t;
		System.out.println("Enter length,width,height,thickness of wooden box");
		dim1=sc.nextDouble();
		dim2=sc.nextDouble();
		dim3=sc.nextDouble();
		t=sc.nextDouble();
		woodbox obj=new woodbox(dim1,dim2,dim3,t);
		System.out.println("The volume of wooden box is "+obj.calc());
		sc.close();
	}
}