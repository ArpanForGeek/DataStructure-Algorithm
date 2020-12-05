package arrays;

/**
 * Find maximum element of array (Traditional way)
 */
public class MaxElementOfArray {

    private static void findMaxElement(int[] arr) {
        int start = 0;
        int end = start + 1;
        int max = 0;
        int currMax = 0;
        while (start != arr.length - 1) {

            if (arr[start] < arr[end]) {
                currMax = arr[end];
                max = currMax;
                start = end;
                end = end + 1;
                if (end > arr.length - 1) {
                    break;
                }

            }
            if (arr[start] > arr[end]) {
                currMax = arr[start];
                max = currMax;
                end = end + 1;
                if (end > arr.length - 1) {
                    break;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 19, 7, 39, 11, 45, 70, 31};
        findMaxElement(arr);
    }
}
