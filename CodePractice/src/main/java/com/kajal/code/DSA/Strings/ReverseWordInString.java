package com.kajal.code.DSA.Strings;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "Hello    World Kajal Rokade";

        String[] str = s.split(" ");
        String result = "";
        for (int i = str.length - 1; i >= 0; i--) {
            if(!str[i].isEmpty())
                result += str[i] + " ";
        }
        System.out.println(result.trim());

    }
}
