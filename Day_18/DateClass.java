import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        Object a = d.clone();
        System.out.println(a);
    }
}
