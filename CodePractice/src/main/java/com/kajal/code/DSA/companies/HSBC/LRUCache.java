package com.kajal.code.DSA.companies.HSBC;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class LRUCache {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] pages = new int[]{1,2,3,2,4,1,5};
//        for (int i = 0; i < n; i++) {
//            pages[i] = sc.nextInt();
//        }
        int cacheSize =3;

        if (cacheSize <= 0) {
            System.out.println("Misses : "+pages.length);
        } else {

            HashSet<Integer> cache = new HashSet<Integer>();
            LinkedList<Integer> order = new LinkedList<>();
            int misses = 0;
            for (int page : pages) {
                if (!cache.contains(page)) {
                    misses++;

                    if (cacheSize == cache.size()) {
                        int lru = order.removeFirst();
                        cache.remove(lru);
                    }
                    cache.add(page);
                } else {
                    order.remove(Integer.valueOf(page));
                }
                order.addLast(page);
            }

            System.out.println("Misses : "+misses);
        }
    }
}
