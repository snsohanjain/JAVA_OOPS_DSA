package DataStructure;

import java.util.Arrays;

public class ArraysDataStructure {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(Arrays.toString(numbers));
        for(int number : numbers){
            System.out.println(number);
        }

        int [] arr = {5, 2, 3, 2, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(arr[i]);
        }

        double [] doubl = {12.1,31.2,4.5,14.6};
        for (int i = 0; i < doubl.length; i++) {
            System.out.println(doubl[i]);
        }

        char [] ch = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

        String [] st = {"Sohan", "Manoj", "Nithin", "Jayanth"};
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }

        boolean [] bool = {true,false,true,true};
        for (int i = 0; i < bool.length; i++) {
            System.out.println(bool[i]);
        }


    }
}
