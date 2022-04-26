public class NoOfevendigits {

    public static void main(String[] args) {
        int arr[] = {3,43,1};
        System.out.println(noOfeven(arr));

    }
        static int noOfeven(int[] arr)
        {
            int number =0;
            for (int i : arr)
            {
                if(even(i))
                {
                    number++;
                }
            }
            return number;
        }

         static boolean even(int i) {
            int noOfdigit = digit(i);
            return noOfdigit%2==0;
        }

        private static int digit(int n)
        {
            int count =0;
            while (n>0)
            {
                count++;
                n = n/10;
            }
            return count;
        }

    }
