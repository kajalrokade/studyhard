package com.kajal.code.DSA.Array;

import java.util.HashMap;

public class ContainseNearByDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println("1 : "+ containsNearbyDuplicate(nums,3));
        int num1[] = new int[]{1, 0, 1, 1};
        System.out.println("2 : " + containsNearbyDuplicate(num1, 1));

        int num2[] = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println("3 : "+containsNearbyDuplicate(num2,2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int j = hm.get(nums[i]);
                if (Math.abs(i - j) <= k)
                    return true;
                else
                    hm.put(nums[i], i);
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}
