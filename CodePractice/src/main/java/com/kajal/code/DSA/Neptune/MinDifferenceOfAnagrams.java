package com.kajal.code.DSA.Neptune;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MinDifferenceOfAnagrams {
    public static List<Integer> getMinimumDifference(List<String> arrList1, List<String> arrList2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrList1.size(); i++) {
            String current = arrList1.get(i);
            String next = arrList2.get(i);
            if (current.length() == next.length()) {
                HashMap<Character, Integer> hm = new HashMap<>();

                for (Character ch : current.toCharArray()) {
                    if (hm.containsKey(ch)) {
                        int cnt = hm.get(ch);
                        hm.put(ch, ++cnt);
                    } else {
                        hm.put(ch, 1);
                    }
                }

                int changes = 0;
                for (char ch : next.toCharArray()) {
                    if (hm.containsKey(ch) && hm.get(ch) > 0) {
                        hm.put(ch, hm.get(ch) - 1);
                    } else {
                        changes++;
                    }
                }

                result.add(changes);

            } else {
                result.add(-1);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        List<String> arrList1 = List.of("tea", "tip", "act");
        List<String> arrList2 = List.of("ate", "pot", "acts");
        List<Integer> result = getMinimumDifference(arrList1, arrList2);
        System.out.println(result);
    }

}
