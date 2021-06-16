import java.util.*;
class Number
{
    int n;
    int arr[];
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+" integers");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sc.close();
    }
    void swap()
    {
        int t1=arr[0],t2=arr[0],ind1=0,ind2=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>t1)
            {
                t1=arr[i];
                ind1=i;
            }
            if(arr[i]<t2)
            {
                t2=arr[i];
                ind2=i;
            }
        }
        int t=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=t;
        System.out.println("The biggest and smallest element is swapped");
    }
    void display()
    {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
class lab37
{
    public static void main(String[] args)
    {
        Number obj1=new Number();
        obj1.read();
        obj1.swap();
        obj1.display();
    }
}