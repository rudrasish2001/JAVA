import java.util.Scanner;
class OverloadD
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class lab36
{
     public static void main(String args[]) 
	{
        Scanner sc= new Scanner(System.in);
       OverloadD obj1 = new OverloadD();
       System.out.println("1.Square\n2.Rectangle\n3.Circle\nEnter choice");
       int ch = sc.nextInt();
       float x,y;
	   switch(ch)
	   {
		   case 1 :
			System.out.println("Enter the side of square");
			x=sc.nextFloat();
			obj1.area((float)x);	
			break;
		   case 2:
		   	System.out.println("Enter the dimensions of rectangle");
			x=sc.nextFloat();
			y=sc.nextFloat();
			obj1.area(x,y);
			break;
		   case 3:
		   	System.out.println("Enter the radius of circle");
			x=sc.nextFloat();
			obj1.area((double)x);
			break;
		   default:
		   	System.out.println("Wrong choice");
	   }
       sc.close();
    }
}
