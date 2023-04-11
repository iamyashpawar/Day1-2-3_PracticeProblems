package Day_3;

public class duplicate_Elements
{
    public static void main(String[] args)
    {
        int[] arr = {10,41,0,20,10,41};


        for(int i = 0 ; i<arr.length;i++)
        {

            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }

    }

}
