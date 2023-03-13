package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapsDataStructure {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Sohan");
        map.put(2,"Nirmal");
        map.put(3,"Nithin");
        //This will Override
        map.put(3,"Jayanth");

        // Print the Map
        System.out.println(map);

        //To get key --> Value
        System.out.println(map.get(2));

        //To get Key
        System.out.println(map.keySet());

        //Loop through the value
        for(int key : map.keySet()){
            System.out.println(map.get(key));
        }

        //Loop Through the Key and Values
        map.forEach((k,v) ->{
            System.out.println(k + " - " + v);
        });

        //To Set Default value
        String defaulvalue = map.getOrDefault(4,"OOPS");
        System.out.println(defaulvalue);

    }
}
