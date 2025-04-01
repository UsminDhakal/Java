
import java.util.ArrayList;

class MyClass<T, L>{
    public T a;
    protected T b;

    MyClass(T a, T b){
        this.a = a;
        this.b = b;
    }

    public void  Display(L value){
        System.out.println(value);
        System.out.println(a + " " + b);

    }
}

public class GenericsPractice {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(1);
        // ArrayList<Object> al = new ArrayList<>(); 
        // al.add(100);
        // al.add("Usmin");

        int a = (int) al.get(0);
        System.out.println(a);

        MyClass<Integer, String> obj= new MyClass<>(10, 10);
        obj.Display("Usmin");




    }
}