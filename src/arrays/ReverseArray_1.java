package arrays;

/**
 * Reverse an Integer array by creating one extra array
 */
public class ReverseArray_1 {

    private static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++) {
            newArray[j] = arr[i];
        }
        return newArray;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 9};
        printArray(reverseArray(arr));
    }

}
