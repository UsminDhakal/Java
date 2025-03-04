class Base{
    int a;

    Base(){
        System.out.println("This is constructor of base Class");
    }

    Base(int a){

        System.out.println("This constructor contain 1 parameter");
        this.a = a;
    }
    public int return1(){
        return 1;
    }
}

class Derived extends Base{
    int a;
    Derived(){
        super(100);
        System.out.println("This is constructor of Derived Class");

    }
    public int return1(){
        return 1;
    }
}
public class thisAndSuper {
    public static void main(String[] args) {
        
        // Base obj = new Base(10);
        // System.out.println("The value of a is "+ obj.a);


        Derived obj = new Derived();

    }
    
}
