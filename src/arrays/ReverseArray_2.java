package arrays;

/**
 * Reverse an String Array by swapping between start element & last element
 */
public class ReverseArray_2 {

    private static String[] reverseArray(String[] arr) {
        int startPoint = 0;
        int endPoint = arr.length - 1;

        while (startPoint < endPoint) {
            String temp = arr[startPoint];
            arr[startPoint] = arr[endPoint];
            arr[endPoint] = temp;

            startPoint++;
            endPoint--;
        }
        return arr;
    }

    private static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Arpan", "Rohit", "Devyani", "Rinita", "Sham"};
        printArray(reverseArray(arr));

    }
}
