package practice.src.DSA.Hash;

import java.util.HashMap;

public class TwoSumUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
       // Output: [0, 1]

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(target - arr[i])) {
                System.out.println(hm.get(target - arr[i]));
                System.out.println(i);
                break;
            }
            hm.put(arr[i], i);

        }
    }
}
