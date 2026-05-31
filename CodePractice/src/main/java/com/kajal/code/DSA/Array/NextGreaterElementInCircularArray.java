package com.kajal.code.DSA.Array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementInCircularArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 1};

        int[] result = new int[a.length];
        Stack<Integer> stack = new Stack<>();
        int n = a.length;
        Arrays.fill(result, -1);

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;
            while (!stack.isEmpty() && stack.peek() <= a[index]) {
                stack.pop();
            }
            if (i < n) {
                result[index] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(a[index]);
        }
        System.out.println(Arrays.toString(result));

    }
}
