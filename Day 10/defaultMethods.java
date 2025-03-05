interface Camera{
    public void takeSnap();

    default void recordNow(){
        System.out.println("Recording videooo!");
    }

}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone {

    public void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }

}


class SmartPhone extends CellPhone implements Camera, Wifi {
    public void takeSnap(){
        System.out.println("Taking Picturesssssss.");
    }

    public void connectToNetwork(String network){
        System.out.println("Connected to network");
    }

    public String[] getNetworks(){
         System.out.println("Getting list of networks");
         String[] networks = {"Usmin", "Hello", "Hiiiiii"};
         return networks;
    }

    public void recordNow(){
        System.out.println("Recordinggggggggggg!");
    }
}
public class defaultMethods {

    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();

        String[] networks = obj.getNetworks();
        for(String i : networks){
            System.out.println(i);
        }

        obj.recordNow();
    }
    
}
