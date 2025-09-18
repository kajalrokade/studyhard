package com.kajal.code.DSA.Strings;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }else{
            HashMap<Character,Integer> hm= new HashMap();
            for(int i=0;i<s.length();i++){
                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<t.length();i++){
                if(hm.containsKey(t.charAt(i)) && hm.get(t.charAt(i)) >= 1) {
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
                }else{
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String s=  "rat";
        String t= "car";
        System.out.println(isAnagram(s,t));
    }
}
