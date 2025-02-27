
public class Methods {

    // static int multiply(int x, int y){
    //     return (x+y)*5;
    // }

    int multiply(int x, int y){
        return (x+y)*5;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // int c = multiply(a, b);
        // System.out.println(c);
        
        Methods obj = new Methods();
        int c;
        c = obj.multiply(5, 6);
        System.out.println(c);


    }
}
