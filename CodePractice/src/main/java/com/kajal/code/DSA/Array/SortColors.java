package com.kajal.code.DSA.Array;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,2,0,1,0,1,0,1};

        int i=0;
        int left=0;
        int right=nums.length-1;

        while(i<right){

            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
                i++;

            }else if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[right];
                nums[right]=temp;
                right--;
                i++;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
