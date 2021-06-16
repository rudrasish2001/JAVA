public class lab94 
{

    public static void main(String[] args)
    {
        String s1 = "Programming with Java";
        String s2 = " is fun.";
        
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2); 
        String s3 = s1.concat(s2);
        System.out.println("The concatenated string: " + s3);
    }
}