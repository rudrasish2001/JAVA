import java.util.*;
class Rectangle1
{
    double length;
    double breadth;
    Rectangle1(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea()
    {
        return length * breadth;
    }
    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}
class lab64
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        double l,b;
        System.out.println("Enter the dimensions of Rectangle");
        l=sc.nextDouble();
        b=sc.nextDouble();
        Rectangle1 rect = new Rectangle1(l,b);
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        sc.close();
    }
}