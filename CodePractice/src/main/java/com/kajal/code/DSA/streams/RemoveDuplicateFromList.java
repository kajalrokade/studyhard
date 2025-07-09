package com.kajal.code.DSA.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");
        list.add("A");
        list.add("B");

        System.out.println(list.size());
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect.size());

    }
}
