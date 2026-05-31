package com.kajal.code.DSA.Array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 10, 8};

        int[] result = new int[a.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= a[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(a[i]);

        }



        System.out.println(Arrays.toString(result));
    }
}
