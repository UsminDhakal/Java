
import java.util.Scanner;

public class handlingSpecificException {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 11;
        marks[2] = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index:");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to divide with:");
        int number = sc.nextInt();

        try {
            System.out.println("The value of array index entered is: " + marks[index]);
            System.out.println("The value of array value /number is: " + marks[index]/number);

        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException "+e);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException "+e);
        }

         catch (Exception e) {
            System.out.println("Some exception occured: " + e);

        }
    }
}
