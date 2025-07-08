package practice.src.DSA.Strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String string = "bbbbbb";

        HashSet<Character> set = new HashSet<>();
        int max = 1;
        for (int i = 0; i < string.length(); i++) {
            if(set.contains(string.charAt(i))){
                max=Math.max(max,set.size());
            }else {
                int k=i;
                while(!set.contains(string.charAt(k))){
                    set.add(string.charAt(k));
                    k++;
                }
            }
        }
        System.out.println(max);
        System.out.println(getLongestSubstring(string));
    }

    private static  int getLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;  // Move left pointer forward
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
