import java.util.*;
class TwoD
{
	int rate=40;
	double calculate(double sqft)
	{
		double amt=sqft*rate;
		return amt;
	}
}
class ThreeD extends TwoD
{
	int rate=60;
	double calculate(double cbft)
	{
		double amt=cbft*rate;
		return amt;
	}
}
class lab41
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int dim;
		System.out.println("Enter the number of dimensions");
		dim=sc.nextInt();
		TwoD obj;
		if(dim==2)
		{
			obj=new TwoD();
			double dim1,dim2;
			System.out.println("Enter the two dimensions");
			dim1=sc.nextDouble();
			dim2=sc.nextDouble();
			double amt=obj.calculate(dim1*dim2);
			System.out.println("The amount is "+amt);
		}
		else if(dim==3)
		{
			obj=new ThreeD();
			double dim1,dim2,dim3;
			System.out.println("Enter the three dimensions");
			dim1=sc.nextDouble();
			dim2=sc.nextDouble();
			dim3=sc.nextDouble();
			double amt=obj.calculate(dim1*dim2*dim3);
			System.out.println("The amount is "+amt);
		}
		else
			System.out.println("Wrong input");
		sc.close();
	}
}