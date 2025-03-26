import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        // System.out.println(dt);


        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY hh:m:s a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(dt.format(df2));
        String date = dt.format(df);
        System.out.println(date);
    }
}
