abstract class Base{
    public Base(){
        System.out.println("I am constructor of Base");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();

}

class Derived extends Base{


    @Override
    public void greet(){
        System.out.println("Hey, Good Morning I am overriding abstract greet method");
    }
}


abstract class Derived2 extends Base{
  

    public void greet2(){
        System.out.println("Hey, Good Morning I am overriding abstract greet method in class derived2");
    }
}

public class abstractClassesAndInterfaces {

    public static void main(String[] args) {
        
        Derived obj = new Derived();
        obj.greet();
        obj.sayHello();

    }
    
}
