package com.kajal.code.DSA.Array;


public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3, 4, 4, 5};
        if (nums.length == 0)
            return;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i + 1);
    }
}
