package mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Black");
        map.put("2", "White");
        map.put("3", "Yellow");
        map.put("10", "Green");
        System.out.println(Methods.getSum(10, 20));


        System.out.println(map.get("1"));
        System.out.println(map.get("10"));

        System.out.println(map.size());
//        map.clear();
        System.out.println(map.size());
        System.out.println(map.containsKey("90"));
        System.out.println(map.containsKey("10"));
        System.out.println(map.containsValue("White"));

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
        System.out.println();
        System.out.println(map.get("2"));
        map.put("2", "Yellow");
        System.out.println(map.get("2"));

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "value1");
        map2.put("key2", "value2");
        System.out.println();
        System.out.println(map2.get("key1"));
    }
}
