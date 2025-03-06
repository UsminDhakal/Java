package Day_11;
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
        System.out.println("Calling " + phoneNumber);
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
public class polymorphism {

    public static void main(String[] args) {
        Camera cam = new SmartPhone();  //This is a smartphone use it as a camera
        // cam.getNetworks(); Not allowed
        cam.recordNow();
        cam.takeSnap();



        SmartPhone obj = new SmartPhone();
        obj.callNumber(949494999);
    }

}
