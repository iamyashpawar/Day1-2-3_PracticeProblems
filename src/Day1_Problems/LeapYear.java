package Day1_Problems;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year :- ");
        int year = sc.nextInt();

        if(year>=1582)
        {
            if( year %4==0 && year % 100 !=0 || year % 400 ==0)
            {
                System.out.println(year + " is Leap year");
            }
            else
            {
                System.out.println(year +" is not leap year");
            }
        }
        else
        {
            System.out.println("Enter Year above 1582");
        }


    }

}
