package practice.src.DSA.streams;

import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 7, 8);

        Integer total = list.stream()
                .mapToInt(i -> i)
                .sum();

        System.out.println(total);
    }
}
