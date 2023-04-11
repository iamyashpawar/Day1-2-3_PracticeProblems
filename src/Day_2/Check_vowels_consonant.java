package Day_2;

import java.util.Scanner;

public class Check_vowels_consonant
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in) ;
        System.out.println("Enter Char ");
        char given_char = sc.next().charAt(0);
        switch (given_char)
        {
            case 'a' :
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent");
        }

    }



}
