import java.util.*;
class NegativeNumberException extends Exception
{
   
    private static final long serialVersionUID = 1L;
    int ex;
    NegativeNumberException(int p)
    {
        ex=p;
    }
    public String toString()
    {
        return("less than 0"+ex);
    }
}
class lab85
{
    static void f1(int a) throws NegativeNumberException
    {
        if(a<0)
        {
            throw new NegativeNumberException(a);
        }
        else
        {
            System.out.println("New number:"+(2*a));
        }
    }
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int a=sc.nextInt();
            f1(a);
        }
        catch(NegativeNumberException e)
        {
            System.out.println("Exception caught ="+e);
        }

    }

}