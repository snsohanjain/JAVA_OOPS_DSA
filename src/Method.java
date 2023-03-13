import java.time.LocalDate;
import java.time.LocalTime;

public class Method {
    public static void main(String[] args) {
        helloWorld();
        var inc = incrementValue(0);
        var currDate = getCurrentDate();
        var currTime = getCurrentTime();
        LocalDate x = getMinusDays(10);
        LocalTime t = getMinusTimeByHours(2);
        var t1 = getMinusTimeByMinutes(30);
        System.out.println(inc);
        System.out.println(currTime);
        System.out.println(currDate);
        System.out.println(x);
        System.out.println(t);
        System.out.println(t1);

    }
    private static void helloWorld(){
        System.out.println("Hello World");
    }
    private static int incrementValue(int value){
        return value + 1;
    }
    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }
    private static LocalTime getCurrentTime(){
        return LocalTime.now();
    }
    private static LocalDate getMinusDays(int value){
        return LocalDate.now().minusDays(value);
    }
    private static LocalTime getMinusTimeByHours(int value){
        return LocalTime.now().minusHours(value);
    }
    private static LocalTime getMinusTimeByMinutes(int value){
        return LocalTime.now().minusMinutes(value);
    }

}
