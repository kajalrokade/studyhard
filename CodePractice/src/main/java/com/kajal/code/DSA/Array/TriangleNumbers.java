package com.kajal.code.DSA.Array;

import java.util.Arrays;

/**
 * Write a function to count the number of triplets in an integer array nums that could form the sides of a triangle. The triplets do not need to be unique.
 *
 * Input:
 * nums = [11,4,9,6,15,18]
 * Output:
 * 10
 * In order for a triplet to be valid lengths of a triangle, the sum of any two sides must be greater than the third side.
 * By sorting the array, we can leverage the two-pointer technique to count all valid triplets in O(n2) time and O(1) space.
 */
public class TriangleNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{11,4,6,9,11,18};
        Arrays.sort(nums);

        int count = 0;
        for (int i = nums.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        System.out.println(count);
    }
}
