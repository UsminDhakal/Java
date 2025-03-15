import java.util.*;

public class arrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(1);
        l1.addFirst(20);
        System.out.println(l1);
        System.out.println(l1.contains(1));
        boolean a = l1.isEmpty();
        System.out.println(a);

        int b = l1.getFirst();
        System.out.println(b);

    }
}
