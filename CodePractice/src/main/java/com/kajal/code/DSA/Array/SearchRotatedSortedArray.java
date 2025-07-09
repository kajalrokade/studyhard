package com.kajal.code.DSA.Array;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[]nums = {4,5,6,7,0,1,2};
        int target = 11;

        findElement(nums,target);
    }

    private static void findElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (nums[start] < nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[end] >= target) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}
