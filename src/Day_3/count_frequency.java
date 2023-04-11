package Day_3;

public class count_frequency
{
    public static void main(String[] args)
    {
        int[] arr={10,20,20,40,10,40};
       int[] arr2 = new int[arr.length];
       int visited = -1;

        for (int i=0;i<arr.length;i++)
        {
            int count =1;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                     count++;
                     arr2[j] = visited;
                }
                if(arr2[i] != visited)
                    arr2[i] = count;
            }
            }

        for (int i =0; i<arr2.length;i++)
        {
            if(arr2[i] != visited)
                System.out.println("  " + arr[i] + " -> " + arr2[i] );
        }
        }




}
