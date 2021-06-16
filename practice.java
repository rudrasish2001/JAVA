abstract class practice
{
    int roll_no,reg_no;
    abstract void course();
}


class kiitian extends practice
{
    void course()
    {
        System.out.println("Web Technology");
    }
    public static void main(String args[]) 
    {
        kiitian obj= new kiitian();
        obj.course();
    }
    
}  