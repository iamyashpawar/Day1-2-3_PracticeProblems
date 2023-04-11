package Day1_Problems;

import java.util.Scanner;

public class compare_two_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String a = sc.nextLine();
        System.out.println("Enter Second String : ");
        String b =  sc.nextLine();

        if(a.equalsIgnoreCase(b))
        {
            System.out.println("String is same");
        }
        else
        {
            System.out.println("String is not same");
        }


    }


}
