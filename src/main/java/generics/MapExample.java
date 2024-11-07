package generics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> nameAgesMap = new HashMap<>();
        nameAgesMap.put("John", 20);
        nameAgesMap.put("Jane", 21);
        nameAgesMap.put("Jack", 22);
        System.out.println(nameAgesMap.get("John"));
    }
}
