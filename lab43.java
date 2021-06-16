class A
{
	void func()
	{
		System.out.println("Inside A's func method");
	}
}
class B extends A
{
	void func()
	{
		System.out.println("Inside B's func method");
	}
}
class C extends A
{
	void func()
	{
		System.out.println("Inside C's func method");
	}
}
class lab43
{
	public static void main(String[] args)
	{
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		A ob;
		ob=obj1;
		ob.func();
		ob=obj2;
		ob.func();
		ob=obj3;
		ob.func();
	}
}