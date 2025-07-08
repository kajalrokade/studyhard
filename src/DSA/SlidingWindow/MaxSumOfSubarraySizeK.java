package src.DSA.SlidingWindow;

public class MaxSumOfSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        // ot=9
        int sum = 0;
        for (int j=0;j<k;j++)
            sum += arr[j];

        int maxSum = sum;
        for (int i = k; i < arr.length ; i++) {
            maxSum = Math.max(sum, maxSum);
            sum += arr[i] - arr[i-k];
        }
        System.out.println(maxSum);

    }
}
