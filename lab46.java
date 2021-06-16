class Base
{
	int a,b;
	Base(int x,int y)
	{
		System.out.println("Inside Base Class's constructor");
		a=x;
		b=y;
	}
}
class Derived extends Base
{
	Derived(int i,int j)
	{
		super(i,j);
		System.out.println("Inside Derived Class's constructor");
	}
}
class Q6
{
	public static void main(String[] args)
	{
		Derived obj=new Derived(5,6);
	}
}