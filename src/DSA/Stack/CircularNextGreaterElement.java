package src.DSA.Stack;

import java.util.*;

public class CircularNextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from 2n-1 down to 0 to simulate circular array
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            // Pop elements smaller or equal
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            // Set result only for first pass
            if (i < n) {
                if (stack.isEmpty()) {
                    result[index] = -1;
                } else {
                    result[index] = stack.peek();
                }
            }

            // Push current element
            stack.push(nums[index]);
        }

        System.out.println(Arrays.toString(result));
    }
}
