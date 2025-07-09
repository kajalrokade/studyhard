package com.kajal.code.DSA.Stack;


import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Max Rectangle Area: " + largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int topIndex = stack.pop();
                int height = heights[topIndex];

                int width;
                if (stack.isEmpty()) {
                    width = i; // rectangle spans from 0 to i
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i); // Push current index
        }

        return maxArea;
    }
}


