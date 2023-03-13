package DataStructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDataStructure {
    public static void main(String[] args) {
        Set <Character> characterSet = new HashSet<>();
//                                       new TreeSet<>();
                                        //For Given Order Matter
//                                       LinkedHashSet<>();
        characterSet.add('A');
        characterSet.add('A');
        characterSet.add('B');
        characterSet.add('C');
        characterSet.add('E');
        characterSet.add('D');

        characterSet.forEach(System.out::println);


    }
}
