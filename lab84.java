import java.util.Scanner;

 public class lab84 {

   public static void main(String[] args) throws NegativeNumberException 
   {

     int a = 0, b = 0;

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter first number: ");
     a = scan.nextInt();
     System.out.print("Enter second number: ");
     b = scan.nextInt();

     int sum =Addition( a, b);
     System.out.println("Sum = " +(a+b));
   }

private static int Addition(int a, int b) {
    return 0;
}
}