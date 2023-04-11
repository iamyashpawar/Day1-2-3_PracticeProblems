package Day_2;

import java.util.Random;
import java.util.Scanner;

public class single_digit_number
{
    public static void main(String[] args)
    {


        Random r = new Random();
        int a = r.nextInt(10);
        System.out.println("Random number: " +a);

        if (a==1)
        {
            System.out.println("One");
        } else if (a==2)
        {
            System.out.println("Two");
        } else if (a==3)
        {
            System.out.println("Three");
        } else if (a==4)
        {
            System.out.println("Four");
        } else if (a==5)
        {
            System.out.println("Five");
        }
        else if (a==6)
        {
            System.out.println("Six");
        } else if (a==7)
        {
            System.out.println("Seven");
        } else if (a==8)
        {
            System.out.println("Eight");
        } else if (a==9)
        {
            System.out.printf("Nine");
        }


    }
}
