import java.util.*;
interface Myinterface 
{
    void earnings(float ba);
    void deductions(float ba);
    void bonus(float ba);
  }
  
  
  abstract class Manager implements Myinterface
  {
   public void earnings(float ba)
     {
      System.out.println("earning="+(ba+ 0.8*ba+0.15*ba));
    }
    public void deductions(float ba)
     {
      System.out.println("deductions: "+(0.12*ba));
    }
  }
  class Substaff extends Manager
  {
    public void earnings(float ba)
     {
      System.out.println("earning="+(ba+ 0.8*ba+0.15*ba));
    }
    public void deductions(float ba)
     {
      System.out.println("deductions: "+(0.12*ba));
    }
   public void bonus(float ba)
     {
      System.out.println("Bonus: "+(0.5* ba));
    }
}
  
  public class lab52 
  {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
      Substaff r1 = new Substaff();
      float ba;
      System.out.print("Enter the basic salary:");
      ba = in.nextFloat();
      r1.earnings(ba);
      r1.deductions(ba);
      r1.bonus(ba);
      in.close();
    }
  }