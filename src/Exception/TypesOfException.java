package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TypesOfException {
    public static void main(String[] args)  {

        // Checked Exception
        try {
            FileInputStream inputStream = new FileInputStream("src/Exception/example.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // UnChecked Exception
        try {
            int result = 10 / 0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide No by 0 "+ e);
        }catch (NumberFormatException | NullPointerException e){
            System.out.println(e);
        } finally {
            System.out.println("Cleaning......");
        }
        //MY Own Exception

        performDivision(2,1);
    }
    static double performDivision(double a, double b){
        if (b == 0){
            throw new MyException("Cannot divide by 0");
        }
        return a / b;
    }
    //MY Own Exception Create
    static class MyException extends RuntimeException{
        public MyException(String message) {
            super(message);
        }
    }

}
