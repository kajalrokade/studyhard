package com.kajal.code.DSA.Array;

public class MaximumSubarraySumPrintArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int tempStart = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                endIndex = i;
                startIndex = tempStart;

            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;

            }
        }
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(arr[i]);
        }
    }
}
