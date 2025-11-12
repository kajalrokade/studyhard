package com.kajal.code.DSA.Strings;

import java.util.Stack;

public class RemoveLastParanthesis {
    public static void main(String[] args) {
        String s= "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        // Your code goes here
        StringBuilder sb= new StringBuilder();

        int count=0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if(ch=='(') {
                count++;

                if(count>1){
                    sb.append(ch);
                }
            }else {
                if(count>1){
                    sb.append(ch);
                }
                count--;
            }
        }
        return sb.toString();
    }
}
