package Exception;

import java.util.Optional;

public class NullPointer {
    public static void main(String[] args) {
        //Method 1
        Integer number = 12345;
        String name = null;
        if(number != null){
            System.out.println(number);
        }else{
            System.out.println("Number is Null");
        }
       if(name != null){
           System.out.println(name);
       }else{
           System.out.println("Name is Null");
       }

       //Method 2
       String brand = null;
       try {
           System.out.println(brand.toUpperCase());
       }catch (NullPointerException e){
           System.out.println("Brand is Null");
       }

       //Method 3
        String company = "Nokia";
        String theBrand = Optional.ofNullable(company).orElse("Samsung");
        System.out.println(theBrand);

        //Method 4
        String company1 = "Apple";
        String theBrand1 = Optional.ofNullable(company1).map(String::toUpperCase).orElse("Samsung");
        System.out.println(theBrand1);

        //Method 5
        String company2 = "Apple";
        String theBrand2 = Optional.ofNullable(company2)
                .map(String::toUpperCase)
                .orElseGet(() ->{
                    //Logic
                    return "Samsung";
                });
        System.out.println(theBrand2);

        //Method 6
        String company3 = null;
        try {
            System.out.println(company3.toUpperCase());
        }catch (Exception e){
            System.out.println("Company name is Null " + e);
        }

    }
}
