package DataStructureProblems;

import java.util.HashMap;
import java.util.Map;

public class DistinctStringElementsWithCount {
    public static Map<Character, Integer> getDistinctElementsWithCount(String input) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {

        String input = "hello world";
        Map<Character, Integer> distinctElementsWithCount = getDistinctElementsWithCount(input);
        for (Map.Entry<Character, Integer> entry : distinctElementsWithCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
