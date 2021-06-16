import java.util.*;
class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }   
    double volume() {
        return width * height * depth;
    }
}
class Demo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double w,h,d;
        System.out.println("Enter the width, height and depth of the box");
        w=sc.nextDouble();
        h=sc.nextDouble();
        d=sc.nextDouble();
        Box obj1=new Box(w, h, d);
        double ans=obj1.volume();
        System.out.println("The volume of the box is "+ans);
        sc.close();
    }
}