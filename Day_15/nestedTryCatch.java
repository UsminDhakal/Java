import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 11;
        marks[2] = 12;

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        try {
            System.out.println("HEllo hello hello");
            try {
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound error " + e);
            }
            System.out.println(marks[index]);

        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
    
}
