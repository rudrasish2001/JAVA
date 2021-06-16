public class compute3
{
    public static void main(String[] args)
    {
        try
        {
            int x=100/0;
            System.out.println(x);
        }
        catch(ArithmeticException e)
        {
            System.out.print("Exception caught:"+e);
            System.out.println("Caught an Exception");
        }
        finally
        {
            System.out.println("Code for finally block");

        }
        System.out.println("rest code");

    }
}
 