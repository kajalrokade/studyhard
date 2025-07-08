package src.DSA.Interview.Arrays;

import java.util.Arrays;

public class FindPermutation {
    public static void main(String[] args) {
        int n = 3;
        String s = "ID";
        int high = n;
        int low = 1;
        int[] result = new int[n];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n - 1] = low;
        System.out.println(Arrays.toString(result));
    }
}
