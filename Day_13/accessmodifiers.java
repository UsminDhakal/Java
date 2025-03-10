package pacakagess;
class SmartPhone{
    public int price;
    private String name = "Apple";
    
    public SmartPhone(int price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println(name + " is the new name of the Smartphone");
    }
}

public class accessmodifiers {

    public String getName(){
        SmartPhone obj = new SmartPhone(1000);
        return obj.getName();
    }
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone(1000);
        // System.out.println(obj.name); //We cannot access private object or method if it is in different class
        System.out.println(obj.price);

        obj.setName("Samsung");
        System.out.println(obj.getName());



        
    }
    
}
