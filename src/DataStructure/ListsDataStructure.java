package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsDataStructure {
    public static void main(String[] args) {
        List numbers = new ArrayList<>();
//        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.remove(1);
        numbers.add(1,-1);

        System.out.println(numbers.contains(4));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        System.out.println("--------------");

        //Print List {}
        System.out.println(numbers);

        //Print with Loop Method 1
        numbers.forEach(System.out::println);

        //Print with Loop Method 2
        for (Object number : numbers){
            System.out.println(number);
        }
        // To Store into Array
        int [] arr = new int[numbers.size()];
        //Loop the Array
        for (int i = 0; i < numbers.size(); i++) {
            arr[i] = (int) numbers.get(i);
        }
        //Print array
        System.out.println(Arrays.toString(arr));

        String n = "SOHAN";
        n.toCharArray();

    }
}
