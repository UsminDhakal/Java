class One{

    public void greet(){
        System.out.println("GOodmorning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}

class Two extends One{


    public void welcome(){
        System.out.println("Welcome");
    }

    @Override
    public void name(){
        System.out.println("My name is Java in class two");
    }
}
public class dynamicmethodDispatch {
    public static void main(String[] args) {

        // One obj = new One();

        // Two obj2 = new Two();
        // obj.name();
        One obj = new Two();
        obj.name();

    }
}
