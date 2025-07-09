package com.kajal.code.DSA.Questions;


import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = {3, 4, 7, 2, -3, 1, 4, 2};
        int  k = 7  ;
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : arr) {
            sum += num;

            // Check if (sum - k) exists in map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store prefix sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
