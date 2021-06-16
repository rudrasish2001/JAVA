public class Lab8Q1
{
    public static void main(String args[])
    {
      int marks[] = { 40, 50, 60 };
      System.out.println("Hello 1");
  
      try
      {
        int m1 = marks[3];                          
        System.out.println("Marks are " + m1);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Do not cross size of array ."  + e );
      }
      System.out.println("Hello 2");
      System.out.println("Hello 3");
    }
  }  
 