
public class FinallyBlock {

    public  static int greet(){
        try {
            int a = 0;
            int c = 10 /0;
            return c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Hello sirrrrrrrrr");
        }


        return -1;

    }
    public static void main(String[] args) {
     
        int a = greet();
        System.out.println(a);
    }
}
