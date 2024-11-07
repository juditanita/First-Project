package counter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

      LocalDate birthday = LocalDate.of(1972,2,21);
        System.out.println(birthday);
        LocalTime startTime = LocalTime.of(14,30);
        System.out.println("Meeting time"+ startTime);
        LocalDateTime eventTime= LocalDateTime.of(2027,3,4,12,20);
        System.out.println("Next event is "+eventTime);






    }
}
