package com.kajal.code.DSA.Stack;

import java.util.Stack;

public class RemoveAllAdjacentString {
    public static void main(String[] args) {
        String str = "abbaca";
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == str.charAt(i)) {
                stack.pop();
            }else{
                stack.push(str.charAt(i));
            }
        }
        System.out.println(stack);
    }
}
