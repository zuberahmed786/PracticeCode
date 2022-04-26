public class HighestBalance {

    public static void main(String[] args)
    {
        int arr[][] =new int[][]{ {1, 2, 3}, {4, 15, 6}, {7, 8, 9}};
        System.out.println("Highest amount is :"+highest(arr));
    }
    static int highest(int [][] accounts)
    {

        int ans = Integer.MIN_VALUE;
        for (int person=0;person<accounts.length;person++)
        {
            int sum=0;
          for (int account =0;account<accounts[person].length;account++)
          {
           sum = sum+accounts[person][account];
          }
          if(sum>ans)
          {
              ans = sum;
          }
        }
        return ans;
    }
}
