package Day_2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class rever_number_while_loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        int rem;
        int rev =0;
        int i = 1;
        while (i<=3)
        {
            rem = num % 10; //3,2
            rev = rev * 10 + rem;//0*10+3=3, 3*10+2 =32,
            num =num /10;//123/10=12,
            i++;
        }
        System.out.println(rev);
    }

}
