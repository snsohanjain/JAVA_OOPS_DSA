public class IncrementValue {
    public static void main(String[] args) {
        int x = 0;
        int y = incrementValue(x);
        System.out.println(y);
    }
    static int incrementValue(int value){
        value++;
        return value;
    }
}
