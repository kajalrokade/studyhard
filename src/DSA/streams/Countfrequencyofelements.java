package src.DSA.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countfrequencyofelements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");
        list.add("A");
        list.add("B");

        Map<String,Long> hm = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(hm);
    }
}
