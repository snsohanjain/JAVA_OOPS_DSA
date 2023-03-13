import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {
        BigDecimal numberOne = new BigDecimal("0.02");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);
        //Print Results
        System.out.println(result);
        //Equals
        System.out.println(numberOne.equals(numberTwo));
        //Compare
        System.out.println(numberOne.compareTo(numberTwo));
    }
}
