package com.kajal.code.DSA.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
From a list of numbers,
filter even numbers,
square them,
 remove duplicates,
  and sort descending
 */
public class StreamChaining {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 2, 4, 8, 9, 10, 12, 6);
        List<Integer> result= numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
