public class compute2 
{
    public static void main(String[] args)
    {
        try
        {
            int x=100/0;
            System.out.println(x);
        }
        catch(NullPointerException e)
        {
            System.out.print("Exception Caught" +e);
            System.out.println("Caught an Exception");
        }
        finally
        {
            System.out.println("Code for finally block");

        }
        System.out.println("rest code");

    }
}
 