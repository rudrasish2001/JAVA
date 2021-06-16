public class LabQ82
{ public static void main(String[] args)  
  {  
try 
    {
    System.out.println("Inside try block");
    System.exit(0);
    }
 catch (NullPointerException exp) 
 {
    System.out.println(exp);
 }
 finally {
    System.out.println("Java finally block");
 }

 } 
}
