package com.kajal.code.DSA.Array;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums= new int[]{2,2,1};
        HashMap<Integer,Integer> hm = new HashMap();

            for(int i=0;i<nums.length;i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }

            for(int i=0;i<nums.length;i++){
                if(hm.get(nums[i])==1){
                    System.out.println(nums[i]);
                }
            }
        }

}
