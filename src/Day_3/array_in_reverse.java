package Day_3;

public class array_in_reverse
{
    public static void main(String[] args)
    {
        int[] arr = {10,41,0,20,10,41};

        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }

    }
}
