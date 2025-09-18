package com.kajal.code.DSA.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hp = new HashMap();
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!hp.containsKey(c) || hp.containsValue(word)) {
                if (hp.containsValue(word)) {
                    for (Map.Entry<Character, String> entry : hp.entrySet()) {
                        if (entry.getValue().equals(word)) {
                            if (entry.getKey() != c)
                                return false;
                        }
                    }
                }
                hp.put(c, word);
            } else if (hp.containsKey(c) && hp.get(c).equals(word)) {

            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abab";
        String s = "cat dog cat cat";
        System.out.println(wordPattern(pattern, s));
    }
}
