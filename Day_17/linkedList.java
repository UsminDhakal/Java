import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(20);
        System.out.println(l1);
        l1.add(0, 0);
        System.out.println(l1);
        // Iterator<Integer> l2=  l1.descendingIterator();
        // while (l2.hasNext()) {
        //     System.out.println(l2.next());
        // }

        l1.remove(1);
        System.out.println(l1);
        l1.remove();
        System.out.println(l1);

        l1.addLast(100);
        System.out.println(l1);

        System.out.println(l1.peekLast());
        System.out.println(l1.peekFirst());

        System.out.println("============================================");

        System.out.println(l1.pollLast());
        System.out.println(l1);

    }
}
