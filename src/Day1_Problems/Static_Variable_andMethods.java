package Day1_Problems;

public class Static_Variable_andMethods
{

    static int c =0;

    public static void m1()
    {
        int a = 300;
        int b = 400;
        a= a+b;
        System.out.println(a);
    }

    public static void main(String[] args)

    {

        int a =10;
        int b = 30;
        int result = a + b * c ;
        System.out.println(result);
       m1(); //method calling
    }


}
