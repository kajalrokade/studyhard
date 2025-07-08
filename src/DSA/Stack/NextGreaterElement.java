package src.DSA.Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};

        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num2.length; i++) {

            if(!stack.isEmpty() && num2[i]> stack.peek()){

                map.put(stack.pop(), num2[i]);
            }
            stack.push(num2[i]);
        }
        while (!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        int[] result=new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            result[i] = map.get(num1[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}