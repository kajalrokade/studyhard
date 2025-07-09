package com.kajal.code.DSA.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterface {
    public static void main(String[] args) {


        Function<String, Integer> nameLength = name -> name.length();
        int len = nameLength.apply("Kajal");
        System.out.println(len);


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
        list.add("Kajal");

        list.stream().map(String::length).forEach(System.out::println);


    }
}
