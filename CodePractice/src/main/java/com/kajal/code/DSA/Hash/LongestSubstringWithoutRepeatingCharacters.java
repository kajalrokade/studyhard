package com.kajal.code.DSA.Hash;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String str = "abcabcbb";
        int start= 0;
        HashMap<Character, Integer> map= new HashMap<>();
        int maxLength = 0;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))) {
                start = Math.max(start, map.get(str.charAt(i)) + 1);
            }
            map.put(str.charAt(i), i);
            maxLength = Math.max(maxLength, i-start+1);
        }
        System.out.println(maxLength);
    }
}
