package com.kajal.code.DSA.Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{1,0,2,1,3,5,4}));
    }

    public static Integer trappingWater(int[] height) {
        // Your code goes here

        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int count = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    count += leftMax - height[left];
                }
            } else {
                right--;
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    count += rightMax - height[right];
                }
            }
        }

        return count;

    }

}
