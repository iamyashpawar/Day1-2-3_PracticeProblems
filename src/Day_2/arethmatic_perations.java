package Day_2;

import java.util.Arrays;
import java.util.Scanner;

public class arethmatic_perations
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a ");
        int a = sc.nextInt();
        System.out.println("Enter number b ");
        int b = sc.nextInt();
        System.out.println("Enter number c ");
        int c = sc.nextInt();

       int ans1,ans2, ans3, ans4;

       //i) a+b*c ii) c+a/b
        //iii) a%b+c iV) a*b+c

        ans1 = a+b*c;
        System.out.println("Answer of first equation " +ans1);

        ans2 = c+a/b;
        System.out.println("Answer of Second equation "+ ans2);

        ans3 = a%b+c;
        System.out.println("Answer of Third equation "+ans3);

        ans4=  a*b+c;
        System.out.println("Answer of Fourth equation "+ ans4);


             if(ans1>ans2 && ans1>ans3 && ans1>ans4)
             {
                 System.out.println("Ans1 is greater " +ans1);
             } else if (ans2>ans1 && ans2>ans3 && ans2>ans4)
             {
                 System.out.println("Ans2 is greater " +ans2);
             } else if (ans3>ans1 && ans3>ans2 && ans3>ans4)
             {
                 System.out.println("Ans3 is greater " +ans3);
             }else
             {
                 System.out.println("Ans4 is greater " + ans4);
             }


             int[] arr= new int[4];

             arr[0] = ans1;
             arr[1] = ans2;
             arr[2] = ans3;
             arr[3] = ans4;
        System.out.println("Length of Array is "+arr.length);

        System.out.println("Max value is " + Arrays.stream(arr).max());
    }
}
