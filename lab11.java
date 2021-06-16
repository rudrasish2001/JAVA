import java.util.*;
class lab11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int day_num;
        System.out.println("Enter the day number of the month February 2021");
        day_num=sc.nextInt();
        String weekday;
        switch((day_num-1)%7+1)
        {
            case 1 :
                weekday="Monday";
                break;
            case 2:
                weekday="Tuesday";
                break;
            case 3:
                weekday="Wednesday";
                break;
            case 4:
                weekday="Thursday";
                break;
            case 5:
                weekday="Friday";
                break;
            case 6:
                weekday="Saturday";
                break;
            case 7:
                weekday="Sunday";
                break;
            default:
                weekday="Wrong Input";
        }
        System.out.println(weekday);
        sc.close();
    }
}