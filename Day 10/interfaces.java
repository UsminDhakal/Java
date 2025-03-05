interface Bicycle {
    int a = 100;
    public void applyBrake(int decrement);
    public void speedUp(int increment);
    
}

interface HornBicycle{
    void blowHorn();
}

class NewBicycle implements Bicycle, HornBicycle{
    public int speed = 100;

    public void applyBrake(int decrement){
        speed = speed- decrement;
        System.out.println("Speed after brake = "+ speed);

    }

    public void speedUp(int increment){
        speed += increment;
        System.out.println("Speed after speed up = "+ speed);

    }
    public void blowHorn(){
        System.out.println("POooooooooooooooooooooooop Pooooooooooop");
    }

}

public class interfaces {
    public static void main(String[] args) {
        NewBicycle obj = new NewBicycle();
        obj.applyBrake(20);
        obj.speedUp(10);

        //We can also use the properties of interfaces class 
        // System.out.println(obj.a);

        //But we cannot modify the property of interface
        // obj.a = 21;

        obj.blowHorn();



    }
}
