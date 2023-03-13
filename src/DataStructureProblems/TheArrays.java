package DataStructureProblems;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String [] str = new String[2];
        str[0] = "Green";
        str[1] = "Black";

        //To Print the Array in Array
        System.out.println(Arrays.toString(str));

        // To Print the Array
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }

        // To Print in reverse Order
        for(int i = str.length - 1; i >= 0; i--){
            System.out.println(str[i]);
        }

        //To Print the Array through ForEach
        for (String st: str) {
            System.out.println(st);
        }

        //To Print the Array in Stream Method
        Arrays.stream(str).forEach(System.out::println);

        //To Convert the Array as a List
        String list = Arrays.asList(str).toString();
        System.out.println(list);

        //To Sort the Array
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));




    }
}
