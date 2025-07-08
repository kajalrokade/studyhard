package practice.src.DSA.Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;

        int[] ans= twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] arr,int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target- arr[i] ;
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }
}
