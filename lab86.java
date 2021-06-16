import java.util.Scanner;
class account
{
private int bal,acno;
account(int a)
{
acno=a;
bal = 500;
System.out.println("Account " + a + " Created");
}
void deposit(int d)
{
bal+=d;
System.out.println("Amount Deposited " + d);
System.out.println("Current Balance " + bal);
}
void withdraw(int d) throws LessBalanceException
{
if(bal - d < 500)
throw new LessBalanceException(d);
else
{
bal-=d;
System.out.println("Amount Withdrawn " + d);
System.out.println("Current Balance " + bal);
}
}
void disp()
{
System.out.println("Account no " + acno + " Balance " + bal);
}
}
class LessBalanceException extends Exception
{
/**
     *
     */
    private static final long serialVersionUID = 1226552576051314488L;
int a;
LessBalanceException(int a)
{
this.a=a;
}
public String toString()
{
return ("Withdrawal Amount " + a + " is not Valid");
}
}
class pg3
{
public static void main(String args[])
{
account a[]=new account[10];
Scanner scanner = new Scanner(System.in);
int i=1,j,ch,amt;
do
{
System.out.println("1.Creation");
System.out.println("2. Deposit");
System.out.println("3. Withdrawal");
System.out.println("4. Display");
ch=scanner.nextInt();
try
{
switch(ch)
{
case 1:
a[i]=new account(i);
i++;
break;
case 2:
System.out.println("Enter account no ");
j=scanner.nextInt();
System.out.println("Enter amount");
amt=scanner.nextInt();
a[j].deposit(amt);
break;
case 3:
System.out.println("Enter account no ");
j=scanner.nextInt();
System.out.println("Enter amount");
amt=scanner.nextInt();
a[j].withdraw(amt);
break;
case 4:
System.out.println("Enter Account no:");
j=scanner.nextInt();
a[j].disp();
break;
}
}catch(Exception e) {System.out.println(e);}
}while(ch!=5);
}
}
