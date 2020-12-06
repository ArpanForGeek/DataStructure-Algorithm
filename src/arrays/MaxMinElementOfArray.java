package arrays;

/**
 * Find maximum & maximum element of array
 */
public class MaxMinElementOfArray {

    static class MaxMin {
        int max;
        int min;
    }

    private static MaxMin findMaxMinElement(int[] arr, int length) {
        MaxMin maxMin = new MaxMin();
        int i = 0;

        /**
         * If Array contains only one element , we are setting first element as min & max both
         */
        if (length == 1) {
            maxMin.max = arr[0];
            maxMin.min = arr[0];
        }

        /**
         * If array has even number of element
         */
        if (length % 2 == 0) {
            if (arr[0] > arr[1]) {
                maxMin.max = arr[0];
                maxMin.min = arr[1];
            } else {
                maxMin.max = arr[1];
                maxMin.min = arr[0];
            }
            i = 2;
        } else {
            /**
             * If array has odd number of element
             */
            maxMin.max = arr[0];
            maxMin.min = arr[0];
            i = 1;
        }

        /**
         * Iterating remaining element to find max & min
         */
        while (i < length - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > maxMin.max) {
                    maxMin.max = arr[i];
                }
                if (arr[i + 1] < maxMin.min) {
                    maxMin.min = arr[i];
                }
            } else {
                if (arr[i + 1] > maxMin.max) {
                    maxMin.max = arr[i + 1];
                }
                if (arr[i + 1] < maxMin.min) {
                    maxMin.min = arr[i + 1];
                }
            }
            /**
             * First two element are already checked
             */
            i = i + 2;
        }
        return maxMin;
    }

    public static void main(String[] args) {

        int[] arr = {1, 16, 37, 73, 9, 2};
        MaxMin maxMin = findMaxMinElement(arr, arr.length);
        System.out.println(maxMin.max);
        System.out.println(maxMin.min);
    }

}
