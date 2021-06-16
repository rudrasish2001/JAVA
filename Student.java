public abstract class Student 
{
    String roll_no;
    String reg_no;
   Student(String roll_no, String reg_no)
{
    this.roll_no = roll_no;
    this.reg_no = reg_no;
}

abstract void role(String roll_no,String reg_no); 
{
    System.out.println("Roll No:"+roll_no);
    System.out.println("Reg No:"+reg_no);
}
static class kiitian extends Student
{
    kiitian() {
		super(roll_no, reg_no);
	}
	void course()
    {
        System.out.println("Web Technology");
    }
    public static void main(String args[]) 
    {
        kiitian obj= new kiitian();
        obj.course();
    }
	@Override
	void role(String roll_no, String reg_no) 
    {
		
	}
    
}

