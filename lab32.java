public class lab32
{  
   int sub( int x, int y) 
   { 
      int a = x - y; 
      System.out.println("Subtraction of two numbers "+x+" and "+y+" is : "+a);
      return a; 
    } 

   double sub(double x, double y) 
   { 
     double b = x - y; 
     System.out.println("Subtraction of two numbers "+x+" and "+y+" is : "+b); 
     return b; 
   } 
public static void main(String[] args) 
{ 
   lab32 s = new lab32(); 
    s.sub(6, 5);  
    s.sub(20.8, 10.9); 
  } 
}
