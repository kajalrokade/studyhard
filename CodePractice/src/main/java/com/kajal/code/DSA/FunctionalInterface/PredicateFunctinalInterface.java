package com.kajal.code.DSA.FunctionalInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctinalInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("AB");
        list.add("AC");
        list.add("AD");
        list.add("AE");
        list.add("AF");
        list.add("AG");


        Predicate<String> startsWithK = name -> name.startsWith("K");

        List<String> kNames = list.stream()
                .filter(startsWithK)
                .toList();
        System.out.println("Names starting with K: " + kNames);

    }
}