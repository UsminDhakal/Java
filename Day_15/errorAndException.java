public class errorAndException {
    public static void main(String[] args) {
        try {
            int a = 5;
            System.out.println(a/0);
        } catch (Exception e) {
            System.out.println("Failed to divide " + e);
        }
    }
}
