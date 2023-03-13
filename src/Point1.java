import java.awt.*;

public class Point1 {
    public static void main(String[] args) {
        var point = new Point(100,200);
        changePoint(point);
        System.out.println(point);
    }
    static void changePoint(Point point){
        point.x = 0;
        point.y = 0;
    }

}
