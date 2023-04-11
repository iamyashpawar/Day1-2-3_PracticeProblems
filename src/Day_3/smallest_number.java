package Day_3;

public class smallest_number
{
    public static void main(String[] args)
    {

        int[] arr = {10, 20, 2, 45, 64, 79};
        int min = arr[4];
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
