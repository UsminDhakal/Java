class Base1{

    int x;

    public Base1(){
        System.out.println("I am a Base 1 COnstructor");
    }

    Base1(int a){
        System.out.println("I am a overloaded construtcor"+a);
    }
    
}


class Derived1 extends Base1{

    int y;
    Derived1(){

        super(0);
        System.out.println("I am a derived Class COnstructor");
    }

    Derived1(int x, int y){

        super(x);
        System.out.println("I am an overloaded constructor with value of y as"+ y);
    }

    
}
public class constructorInheritance {

    public static void main(String[] args) {

        // Derived1 derived = new Derived1();  //While creating object of derived class, at first base class constructor will run and finally Derived class constructor will run.


        Derived1 derived1 = new Derived1(4, 9);


        
    }
}