package arrays;

import java.util.Arrays;

/**
 * Performs operation to finds minimum length of sub array with sum greater than or equals to the  given value -"target"
 */
public class SmallestLengthSubArray {

    /**
     * Returns integer array with positive element
     *
     * @param arr Integer array provided by user .
     * @return integer array with positive element
     */
    private static int[] removeNegativeElementFromArray(int[] arr) {
        /**
         * Removing negative number from array before starting operation
         */
        return Arrays.stream(arr).filter(i -> i >= 0).toArray();
    }


    /**
     * Performs below operations:
     * Removes non - positive element from array
     * Finds minimum length of sub array with sum greater than or equals to the  given value -"target"
     *
     * @param arr    Integer array provided by user .
     * @param target target sum
     * @return int
     */
    public static int subArrayExceedSum(int[] arr, int target) {

        int[] intArrayWithPositiveNumber = removeNegativeElementFromArray(arr);
        int startPoint = 0;
        int endPoint = 0;

        int minimumLength = intArrayWithPositiveNumber.length + 1;
        int currentSumOfSubArrayElement = 0;


        while (endPoint < intArrayWithPositiveNumber.length) {

            while (currentSumOfSubArrayElement < target && endPoint < intArrayWithPositiveNumber.length) {
                currentSumOfSubArrayElement = currentSumOfSubArrayElement + intArrayWithPositiveNumber[endPoint++];
            }

            while (currentSumOfSubArrayElement >= target && startPoint < intArrayWithPositiveNumber.length) {
                if (endPoint - startPoint < minimumLength) {
                    minimumLength = endPoint - startPoint;
                }
                currentSumOfSubArrayElement = currentSumOfSubArrayElement - intArrayWithPositiveNumber[startPoint++];
            }
        }
        if (minimumLength == intArrayWithPositiveNumber.length + 1) {
            return -1;
        }
        return minimumLength;
    }


    /**
     * Test case 1 : length of shortest array whose sum is at lease 6.  Sum exists so return 1
     * Test case 2 : length of shortest array whose sum is at lease 12. Sum does not exist .so return -1
     * Test case 3: Removing negative numbers as our array should take only positive integer and find
     * length of shortest array whose sum is at lease 3.  Sum exists so return 1
     * Test case 4: Removing negative numbers as our array should take only positive integer and find
     * length of shortest array whose sum is at lease 93.  Sum exists so return -1
     */
    public static boolean doTestsPass() {
        boolean result = true;
        int[] arr = {1, 2, 3, 4};
        result = result && subArrayExceedSum(arr, 6) == 2;
        result = result && subArrayExceedSum(arr, 12) == -1;

        int[] arrayWithNegEle = {1, 2, 3, 4, -9};
        result = result && subArrayExceedSum(arrayWithNegEle, 3) == 1;
        result = result && subArrayExceedSum(arrayWithNegEle, 93) == -1;
        return result;
    }

    public static void main(String[] args) {
        String result = doTestsPass() ? "All Tests are passed" : "Failed";
        System.out.println(result);
    }
}
