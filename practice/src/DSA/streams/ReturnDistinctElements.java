package practice.src.DSA.streams;

import java.util.List;

public class ReturnDistinctElements {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 7, 8,3,8,12);
        list.stream().distinct().forEach(System.out::println);

    }

}
