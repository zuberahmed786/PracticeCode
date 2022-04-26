import java.util.ArrayList;

public class ReverseArrayInGroup {
    static void reverse(ArrayList<Integer> arr,int n,int k)
    {
        if(k<=0)
        {
            System.out.println("Empty array not allowed");
        }
        else
        {
            // int s = arr.size()/n;
            for (int i = 0; i < n; i += k)
            {
                int left =i;
                int right = i+1;
                int swap;
                while(left<right)
                {
                    swap= arr.get(left);
                    arr.set(left, arr.get(right));
                    arr.set(right, swap);
                    left+=1;
                    right-=1;
                }
            }

        }
    }
}
