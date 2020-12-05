package arrays;

/**
 * Reversing an Integer Array by using  recursive way
 */
public class ReverseArray_3 {

    private static void reverseArray(int[] arr, int startPoint, int endPoint) {

        if (startPoint >= endPoint)
            return;

        int temp = arr[startPoint];
        arr[startPoint] = arr[endPoint];
        arr[endPoint] = temp;
        reverseArray(arr, startPoint + 1, endPoint - 1);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 3, 6};
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
