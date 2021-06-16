public class lab96 
{
    public static void main(String[] args) 
    {
        String s1 = "google.com", s2 = "Google.com";
        CharSequence cs = "google.com";
         System.out.println("Comparing "+s1+" and "+cs+": " + s1.contentEquals(cs));
        System.out.println("Comparing "+s2+" and "+cs+": " + s2.contentEquals(cs));
              
    }
    
}