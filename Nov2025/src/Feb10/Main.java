package Feb10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("John", 98);
        marks.put("John", 99);
////        System.out.println(marks);
        marks.putIfAbsent("John", 100);
        Set<Map.Entry<String, Integer>> entrySet = marks.entrySet();

        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() + "-> " + entry.getValue());

        }
////        System.out.println(marks);
//        System.out.println(marks.put("jj", marks.getOrDefault("jj", 24)));
//        System.out.println(marks);



    }
}
