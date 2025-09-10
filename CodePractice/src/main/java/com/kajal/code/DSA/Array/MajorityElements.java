package com.kajal.code.DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums1 = {2,3,3};
        System.out.println(majorityElement(nums1));
    }
    public static int majorityElement(int[] nums) {
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            for (int num : nums) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            int n = nums.length;
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() > n / 2) {
                    return entry.getKey();
                }
            }

            return -1;

    }
}
