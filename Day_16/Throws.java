
public class Throws {

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Result ");
        
    }
}
