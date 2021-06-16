public class lab24
{
    static int count=0;
    lab24()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        lab24 obj1 = new lab24();
        lab24 obj2 = new lab24();
        lab24 obj3 = new lab24();
        lab24 obj4 = new lab24();
        System.out.println("Number of objects created:"+count);
    }
}
