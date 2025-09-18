package com.kajal.code.DSA.Array;


public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int left=0;
        int right=nums.length-1;
        int leftMax= nums[left];
        int rightMax=nums[right];

        while(left<right){
           if(leftMax < rightMax){
               left++;
           } else{
               right--;
           }
        }
    }
}
