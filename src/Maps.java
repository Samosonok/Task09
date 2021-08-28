import java.util.HashMap;
import java.util.Map;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 1956);
        map.put("Charlotte", 1945);
        map.put("Rebecca", 1999);
        map.put("Laura", 1932);
        map.put("Iren", 2008);
        map.put("Peter", 1983);
        map.put("Michael", 1976);
        map.put("Bob", 1989);
        map.put("Kristen", 1993);
        map.put("Victoria", 1969);
        System.out.println(map);
        System.out.println(swapKeysAndValues(map));
    }

    public static Map<Integer, String> swapKeysAndValues(Map<String, Integer> map){
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }
}
