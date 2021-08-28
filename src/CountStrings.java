import java.util.*;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class CountStrings {

    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();
        System.out.println("Entered lines:\n" + getStrings(newList));
        System.out.println("Number of lines entered:\n" + countStrings(newList));
    }

    public static List<String> getStrings(List<String> newList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something and then enter \"stop\":");
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            if (a.equals("stop")) {
                break;
            }
            newList.add(a);
        }
        return newList;
    }

    public static Map<String, Integer> countStrings(List<String> newList) {
        HashMap<String, Integer> countedStrings = new HashMap<>();
        for (String b : newList) {
            countedStrings.put(b, Collections.frequency(newList, b));
        }
        int maxValueInMap = (Collections.max(countedStrings.values()));
        int minValueInMap = (Collections.min(countedStrings.values()));
        System.out.println("Lines that are entered more often than others:");
        for (Map.Entry<String, Integer> entry : countedStrings.entrySet()) {
            if (entry.getValue() == maxValueInMap || entry.getValue() == maxValueInMap-1
                    && entry.getValue() != minValueInMap) {
                System.out.println(entry.getKey());
            }
        }
        return countedStrings;
    }
}