package practice.src.DSA.streams;

import java.util.List;

public class ConvertListOfStringsUppercase {
    public static void main(String[] args) {
        List<String> list =List.of("kajal","abhijeet","abc","xyz","lmnop");

        list.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}
