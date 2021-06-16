public class lab97 
{

    public static void main(String[] args) 
    {
    
        String s1 = "wikipedia.com", s2 = "Wikipedia.com";
        StringBuffer strbuf = new StringBuffer(s1);
        
        System.out.println("Comparing "+s1+" and "+strbuf+": " + s1.contentEquals(strbuf));
        
        System.out.println("Comparing "+s2+" and "+strbuf+": " + s2.contentEquals(strbuf));
        
    }
}