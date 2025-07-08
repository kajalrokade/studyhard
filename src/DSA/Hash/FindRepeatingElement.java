package src.DSA.Hash;

import java.util.HashMap;

public class FindRepeatingElement {
    public static void main(String[] args) {
        int a[]= {1, 5, 3, 4, 3, 5, 6};
        //Output: 5

        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
                hs.put(a[i],hs.getOrDefault(a[i],0) + 1);
        }
        for (int i = 0; i < a.length; i++) {
            if (hs.get(a[i])>1) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
