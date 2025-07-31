package com.kajal.code.DSA.Strings;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!isSpecialChar(s.charAt(i)))
                str.append(s.charAt(i));
        }
        StringBuilder s1=new StringBuilder(str.toString());
        s1.reverse();
        return str.toString().contentEquals(s1);
    }
    private static boolean isSpecialChar(char a){
        return (a =='!' || a== ',');
    }

    public static void main(String[] args) {
        String s1="race a car";
        System.out.println(isPalindrome(s1));
    }
}
