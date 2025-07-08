package practice.src.DSA.Array;

public class MaximumSumofCircularSubarray {
    public static void main(String[] args) {
        int[] arr = {5, -3, 5};
        //ot =10
        int total = 0;
        int currentMax = arr[0];
        int maxSum = arr[0];

        int currentMin = arr[0];
        int minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            total += num;

            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        if (maxSum < 0) {
            System.out.println("Max Circular Subarray Sum: " + maxSum);  // all negatives case
        } else {
            System.out.println("Max Circular Subarray Sum: " + Math.max(maxSum, total - minSum));
        }
    }
}
