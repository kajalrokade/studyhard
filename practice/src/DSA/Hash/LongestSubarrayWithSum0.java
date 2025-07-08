package practice.src.DSA.Hash;

import java.util.HashMap;

public class LongestSubarrayWithSum0 {
    public static void main(String[] args) {
        int[] a= {15, -2, 2, -8, 1, 7, 10, 23};
        //Output: 5

        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLength=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum == 0) {
                maxLength = i + 1;
            }

            if(hm.containsKey(sum)){
                int length = i-hm.get(sum);
                maxLength=Math.max(length, maxLength);
            }else {
                hm.put(sum, i);
            }
        }
        System.out.println(maxLength);
    }
}
