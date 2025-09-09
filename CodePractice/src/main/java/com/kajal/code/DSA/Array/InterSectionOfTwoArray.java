package com.kajal.code.DSA.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class InterSectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 4, 2, 1};
        int [] nums2 = new int[] {2, 2};

        //output [2,2]

        ArrayList<Integer> result = new ArrayList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums1.length; i++) {
                map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) >=1 ){
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        result.forEach(System.out::println);
    }
}
