package com.kajal.code.DSA.Strings;

import java.util.Stack;

public class ReverseStringByWord {
    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }

    public static  String reverseWords(String s) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        s.trim();
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                st.push(str);
                str = "";
            } else {
                str += ch;
            }
        }
        st.push(str);
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()  ) {
            if(st.peek()!="") {
                sb.append(st.pop() + " ");
            }else{
                st.pop();
            }
        }
        return sb.toString().trim();
    }
}



