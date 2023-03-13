package DataStructureProblems;

import java.util.ArrayList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(10));

    }
}
