package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ZoneDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Toronto"));

        //Print all Available Zones
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println(localDateTime);
        System.out.println(LocalDateTime.now());

    }
}
