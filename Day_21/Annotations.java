
@FunctionalInterface
interface MyFunctionInterface{
    void thisMethod();
}


class Phone{
    @Deprecated
    public void usePhone(){
        System.out.println("I am using a Phone");
    }
}
public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.usePhone();
    }
}
