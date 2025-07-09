package com.kajal.code.DSA.streams;

import java.util.Map;
import java.util.LinkedHashMap;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindthefirstnonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "aabccbd";
        Character result = input.chars()  // returns IntStream
                .mapToObj(c -> (char) c)  // convert to Stream<Character>
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()  // count occurrences
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
