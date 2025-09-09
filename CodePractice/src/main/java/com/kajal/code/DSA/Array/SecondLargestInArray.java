package com.kajal.code.DSA.Array;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 4, 8, 9, 9};

        if (nums.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest: " + second);
            System.out.println("Largest: " + first);
        }
    }

}
