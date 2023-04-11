package Day_2;

import java.util.Scanner;

public class sum_of_natural_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New Number : ");
        int no =sc.nextInt();
       int sum=0;
       int i=1;
        while(i<=no)
        {
            sum =sum + no;//0+5=5,5+5=10,10+5=15,15+5=20,

            i++;
        }
        System.out.println("Sum of n Natural Number"+ sum);
    }
}
