package Day_3;

public class sorting_array
{
    public static void main(String[] args)
    {

        int[] arr= {10,54,5,64,46,456};
        int temp =0;
        for(int i =0 ; i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
              if (arr[i]>arr[j])
              {
                  temp = arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
            }
        }
         for (int a:arr)
         {
             System.out.print(" "+a);
         }



    }
}
