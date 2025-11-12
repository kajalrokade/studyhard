package com.kajal.code.DSA.Strings;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacters {
    public static void main(String[] args) {
        String str="abracadabra";

        Optional< Map.Entry<Character,Long>> map =str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());


        map.ifPresent(characterLongEntry -> System.out.println(characterLongEntry.getKey()));

    }
}
