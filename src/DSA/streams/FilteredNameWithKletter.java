package src.DSA.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredNameWithKletter {
    public static void main(String[] args) {
        List<String> names = List.of("Kajal","Kavya","Naaz","Tushar","Kishor");

        List<String>  filter = names.stream().filter(name -> name.startsWith("K"))
                .collect(Collectors.toList());

        System.out.println(filter);

        filter.stream().forEach(name -> {
            char[] nms= name.toCharArray();
            HashMap<Character,Integer> hm= new HashMap<>();
            for(int i=0; i<nms.length; i++){
                if(hm.containsKey(nms[i])){
                    hm.put(nms[i],hm.get(nms[i])+1);
                }else {
                    hm.put(nms[i], 1);
                }
            }
            System.out.println(name +" " +hm);
        });


    }
}
