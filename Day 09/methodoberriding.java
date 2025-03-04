class Base{
    int a;
    public void display(){
        System.out.println("This is the display method of base class");
        
    }
}

class Derived extends Base{
    int a;
 
    @Override
    public void display(){
        System.out.println("This is the display method of derived class");
        
    }
}
public class methodoberriding {


    public static void main(String[] args) {
        
        Derived derived = new Derived();
        derived.display();
    }
    
}
