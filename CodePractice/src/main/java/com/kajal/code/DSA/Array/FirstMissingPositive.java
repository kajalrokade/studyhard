package com.kajal.code.DSA.Array;

import java.util.HashSet;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs= new HashSet();
        int k=1;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(k)){
                return k;
            }else{
                k++;
                hs.add(nums[i]);
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
    }
}
