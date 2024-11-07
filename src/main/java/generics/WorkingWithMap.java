package generics;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args) {
        Map<String, Integer> nameAgesMap = new HashMap<>();
        nameAgesMap.put("Gina", 7);
        nameAgesMap.put("Casanova", 7);
        nameAgesMap.put("Jack", 88);
        nameAgesMap.put("Judit", 21);






for(Map.Entry<String, Integer> entry : nameAgesMap.entrySet()) {


    if(entry.getKey().equals("Judit")) {
        nameAgesMap.put(entry.getKey(), 52);
    }
    System.out.println(entry.getKey() + " " + entry.getValue());
}

nameAgesMap.remove("Jack");
        System.out.println();

    }
}
