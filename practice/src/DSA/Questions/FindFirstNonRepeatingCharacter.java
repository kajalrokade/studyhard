package practice.src.DSA.Questions;

import java.util.HashMap;
import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "aabbcdd";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }else
                map.put(ch, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch) && map.get(ch) == 1) {
                System.out.println("Character " + ch + " is non repeating");
                break;
            }
        }

    }
}
