public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {9, 8, 6, 4, 2};
        System.out.println(binarySearch(arr, 2));
    }

    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (isAsc) {
                System.out.println("Ascending called");
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                System.out.println("Descending called");
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
