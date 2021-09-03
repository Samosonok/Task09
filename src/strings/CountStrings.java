package strings;

import java.util.*;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class CountStrings {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Number of lines entered:\n" + getStrings(map));
        System.out.println("Two lines that are entered more often than others:\n" + getTwoStrings(map));
    }

    public static Map<String, Integer> getStrings(HashMap<String, Integer> map) {
        List<String> newList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something and then enter \"stop\":");
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            if (a.equals("stop")) {
                break;
            }
            newList.add(a);
        }
        for (String b : newList) {
            map.put(b, Collections.frequency(newList, b));
        }
        return map;
    }

    public static String getTwoStrings(HashMap<String, Integer> map){
        MapComparator comparator = new MapComparator();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(comparator);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>(list.size());
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        String[] array = new String[sortedMap.size()];
        sortedMap.keySet().toArray(array);
        return (array[array.length-1] + ", " + array[array.length-2]);
    }
}