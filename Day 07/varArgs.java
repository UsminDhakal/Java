
public class varArgs {

    // static int sum(int a, int b){
    //     return a+b;
    // }

    static int sum(int ...arr){
        int value = 0;
        for (int i : arr) {
            value += i;
        }
        return value;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 9, 9,9 ));

    }
}
