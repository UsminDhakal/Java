
public class methodsOverloading {

    public static void telljoke(){
        System.out.println("Hello i am writing a joke!");
    }

    public static void change(int value){
        value  = 99;
    }
    public static void changeArray(int[] arr){
        arr[0] = 100;
    }
    public static void main(String args[]){
        // telljoke();

        int [] marks = {43, 43, 54, 55, 67, 76};

        //Changing the integer
        // int x = 100;
        // change(x);
        // System.out.println("The value of x after running change is:"+ x);

        // ===================================================================================

        changeArray(marks);
        System.out.println(marks[0]);
    }
  
}
