import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(98);
        l2.add(98);
        l2.add(98);
        l2.add(98);


        l1.add(6);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(3);

        System.out.println(l1);
        for (Integer i : l1) {
            System.out.println(i);
        }
        System.out.println("==================================================================");

        l1.add(0, 9);
        l1.addAll(l2);

        for(int i= 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }

        // l2.clear();
        // System.out.println(l2);

        System.out.println(l1.contains(98));
        System.out.println(l1);
        System.out.println(l1.indexOf(98));

        l1.set(1, 9);
        System.out.println(l1);
    }
}
