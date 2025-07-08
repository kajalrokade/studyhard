package practice.src.DSA.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,4,5,6,7,8,2,1,2,3,2,11,2,232,121,121,3232,212,21,111,12);
        Optional<Integer> first = list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(first.get());
    }
}
