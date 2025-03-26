import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);


        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
