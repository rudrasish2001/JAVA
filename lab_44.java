class super_class
 {
    int num = 20;
    public void display() {
       System.out.println("This is the display method of superclass");
    }
 }
 
 public class lab_44 extends super_class {
    int num = 10;
 
    public void display() {
       System.out.println("This is the display method of subclass");
    }
 
    public void my_method()
     {
       lab_44 sub = new lab_44();
       sub.display();
       super.display();
       System.out.println("value of the variable named num in sub class:"+ sub.num);
       System.out.println("value of the variable named num in super class:"+ super.num);
    }
 
    public static void main(String args[])
     {
       lab_44 obj = new lab_44();
       obj.my_method();
    }
 }