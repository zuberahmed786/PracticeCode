public class SumofTwosubArray {

    public static void sumOfArr(int arr[])
    {
        int left_sum=0;
        int right_sum=0;
        int i=-1,j=-1;
        for ( i =0;i<arr.length;i++)
        {
            for ( j=arr.length-1;i<j;j--)
            {
                left_sum =left_sum +arr[i];
                right_sum = right_sum+arr[j];
                while (left_sum<right_sum && i<j)
                {
                    i++;
                    left_sum = left_sum+arr[i];
                }
                while (right_sum<left_sum&&i<j)
                {
                    j--;
                    right_sum = right_sum+arr[j];
                }
            }
        }
        if (left_sum==right_sum )
        {
            System.out.println("Element is "+arr[j]);
        }
        else
        {
            System.out.println("no sub array found");
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {1,4,3,5};
        SumofTwosubArray.sumOfArr(arr);
    }
}
