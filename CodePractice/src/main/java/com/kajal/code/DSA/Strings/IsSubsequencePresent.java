package com.kajal.code.DSA.Strings;

public class IsSubsequencePresent {
    public static boolean isSubsequence(String s, String t) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = k; j < t.length(); j++) {
                if (t.charAt(j) == ch) {
                    k = j + 1;
                    count++;
                    break;
                }
            }
        }
        return count == s.length();

    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc")); // false
        System.out.println(isSubsequence("abc", "ahbgdc")); // true

    }
}
