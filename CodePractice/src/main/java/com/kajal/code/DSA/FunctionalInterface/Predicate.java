package com.kajal.code.DSA.FunctionalInterface;
import java.util.ArrayList;
import java.util.List;

public class Predicate {
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

        list.stream().filter(name ->name.startsWith("A")).forEach(System.out::println);
    }
}