package src.DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        int k = 1;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: empty subarray sum is 0

        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;

            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
