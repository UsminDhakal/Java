interface A{
    static void greet(){
        System.out.println("Hello Hello");
    }
}

class myClass implements A{
    // @Override If we use this annotation than it will throw error because myCLass doesnot know greet method exists in interface A because of static keyword
    public void greet(){
        System.out.println("hEY");
    }
    
}
public class StaticInIterface {
    public static void main(String[] args) {
        myClass obj = new myClass();

        A.greet(); // Static method of interface can only be called by using the name of the interface. Static method of interface cannot be override.We can make method of same name in implementation class, doing this it creates a new method of implementation class.
        
        
    }    
}
