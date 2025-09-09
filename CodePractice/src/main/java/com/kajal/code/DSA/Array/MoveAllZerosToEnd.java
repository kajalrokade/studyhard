package com.kajal.code.DSA.Array;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        Arrays.fill(nums, j, nums.length, 0);
        System.out.println(Arrays.toString(nums));
    }
}
