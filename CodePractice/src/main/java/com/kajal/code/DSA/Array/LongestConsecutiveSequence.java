package com.kajal.code.DSA.Array;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int a[]= {100, 4, 200, 1, 3, 2};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++)
            hs.add(a[i]);


        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(!hs.contains(a[i]-1)){
                int count=1;
                while(hs.contains(a[i]+count)){
                    count++;
                }
                max=Math.max(count,max);
            }

        }
        System.out.println(max);
    }
}
