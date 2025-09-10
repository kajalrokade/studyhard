package com.kajal.code.DSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4};

        System.out.print("Using HashSet:");
        HashSet<Integer> hs= new HashSet();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        System.out.println(hs.size() != nums.length);
        System.out.print("Using Stream:");
        long l = Arrays.stream(nums).distinct().count();
        System.out.println(l!=nums.length);

        System.out.print("Using HashMap:");
        HashMap<Integer,Integer> hm= new HashMap();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                System.out.println(true);
            else {
                hm.put(nums[i], 1);
            }
        }

    }
}
