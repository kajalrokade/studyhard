package com.kajal.code.StriverDSASheet.Array.easy;

/**
 * Example 1:
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 2
 * 	Second Largest : 5
 * Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
 */
public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 7, 7, 5};


        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        if (arr.length < 2) {
            System.out.println(-1);
        }
        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            } else if (secondMin > arr[i] && min != arr[i]) {
                secondMin = arr[i];
            }

            if (max < arr[i]) {

                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i] && max != arr[i]) {
                secondMax = arr[i];
            }

        }
        System.out.println(secondMin);
        System.out.println(secondMax);

    }
}
