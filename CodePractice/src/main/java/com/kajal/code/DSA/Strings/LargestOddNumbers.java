package com.kajal.code.DSA.Strings;

public class LargestOddNumbers {
    public static void main(String[] args) {
        String s= "35427";
        for(int i=s.length()-1;i>=0;i--) {
            char ch = s.charAt(i);
            int n = Character.getNumericValue(ch);
            if (n % 2 != 0) {
                System.out.println(s.substring(0,i+1));
                return;
            }
        }

    }
}
