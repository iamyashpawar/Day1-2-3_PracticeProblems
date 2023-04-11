package Day_3;

public class Second_highest
{

    public static void main(String[] args)

    {
        int temp =0;
        int[] arr = {2,3,6,9};

        for (int i = 0; i<arr.length;i++)
        {
            for(int j =i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i]; //i=10
                    arr[i]= arr[j];  //temp=30
                    arr[j] = temp ; //i=30
                }
            }
        }
              for (int a:arr)
              {
                  System.out.print(" "+a);
              }
        System.out.println("   ");

        System.out.println(arr[2]);


    }

}
