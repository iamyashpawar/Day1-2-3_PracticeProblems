package Day_2;

import java.util.Scanner;

public class Spring_season
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date ");
        int d = sc.nextInt();
        System.out.println("Enter month ");
        int m = sc.nextInt();

        if (d>=20 && m>=3 && m<=6)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }

}
