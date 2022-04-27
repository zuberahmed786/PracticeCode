import java.util.ArrayList;

public class SubArrSum {
    //Function to find first and last index of subarray sum equal to given number
    public static Object subSum(int [] arr , int n, int sum)
    {
        int curr_sum,i=0,j=0;
        int p = 0;
        for (i =0;i<n;i++)
        {
            curr_sum = arr[i];

            for (j=i+1;j<=n;j++)
            {
                if (curr_sum==sum)
                {
                    p = j-1;
                    System.out.println("Array Found index between "+i+ " to "+p);
                    return 1;
                }
                if (curr_sum>sum|| n==j)
                   break;
                curr_sum = curr_sum +arr[j];
            }
        }
        System.out.println("No subArray Found!!!");

        return 0;
    }

    public static void main(String[] args)
    {
       int[] arr = {12,2,4,5,6,7};

       SubArrSum.subSum(arr,arr.length,6);
    }
}
