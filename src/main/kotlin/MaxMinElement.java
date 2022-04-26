import java.util.Arrays;

public class MaxMinElement {
    public static void rearrange(long arr[], int n){

        long[] temp = arr.clone();
        boolean flag = true;
        int min = 0;
        int max = n-1;

        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[max--];
            else
                arr[i] = temp[min++];

            flag = !flag;
        }
    }
    public static void main(String[] args)
    {
        long [] arr = {2,3,4,5,6,8};
        rearrange(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
