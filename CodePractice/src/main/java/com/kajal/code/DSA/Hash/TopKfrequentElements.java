package com.kajal.code.DSA.Hash;

import java.util.*;

public class TopKfrequentElements {
    public static void main(String[] args) {
        int[] arr= {1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }else
                hm.put(arr[i],1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(hm.entrySet());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll().getKey());
        }

        System.out.println(result);
    }
}
