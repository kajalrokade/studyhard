package com.kajal.code.DSA.Strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        String s1 = strs[0];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int count = 0;
            for (int j = 1; j < strs.length; j++) {
                if (i< strs[j].length() && strs[j].charAt(i) == ch) {
                    count++;
                }else if (i< strs[j].length() && strs[j].charAt(i) != ch){
                    return result.toString();
                }
            }
            if (count == strs.length - 1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"cir","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
