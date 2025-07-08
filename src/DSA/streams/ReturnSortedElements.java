package src.DSA.streams;
import java.util.List;

public class ReturnSortedElements {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 7, 8,3,8,12);
        list.stream().sorted().forEach(System.out::println);
    }
}
