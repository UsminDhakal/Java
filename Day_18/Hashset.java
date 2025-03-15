import java.util.HashSet;

public class Hashset{
    public static void main(String[] args) {

        HashSet l1 = new HashSet<>(10, 0.5f);

        l1.add(3);
        l1.add(4);
        l1.add(2);

        System.out.println(l1);


    }
}