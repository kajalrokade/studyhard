package src.DSA.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementSameArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        Stack<Integer> stack = new Stack<>();
        int[] result= new int[arr.length];
        stack.push(arr[arr.length-1]);
        result[arr.length-1] = -1;
        for (int i = arr.length-2; i >=0; i--) {

            while(!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty() )
                result[i] = -1;
             else
                 result[i] = stack.peek();

            stack.push(arr[i]);

        }
        System.out.println(Arrays.toString(result));
    }
}
