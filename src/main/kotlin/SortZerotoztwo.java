public class SortZerotoztwo {
    static void print(int[] arr,int n) {
        for (int i = 0; i < n; i++)
            System.out.println("number is>>" + arr[i]);
    }
    public static void sortDigits(int [] arr, int n)
    {

        if (n<0)
        {
            System.out.println("Array should not empty::");
        }
        else
        {
            int i,c0 =0,c1=0,c2=0;

            for ( i=0;i<n;i++)
            {
                switch (arr[i])
                {
                    case 0:
                        c0++;
                        break;
                    case 1:
                        c1++;
                        break;
                    case 2:
                        c2++;
                        break;
                }
            }
            i =0;
            while (c0>0)
            {
                arr[i++] =0;
                c0--;
            }
            while (c1>0)
            {
                arr[i++] =1;
                c1--;
            }
            while (c2>0)
            {
                arr[i++]=2;
                c2--;
            }
            print(arr,n);
        }

    }
    public static void main(String[] args)
    {
        int arr[] ={1,2,0,1,1,2,0,0,2};
        int size = arr.length;
        SortZerotoztwo.sortDigits(arr,size);

    }
}
