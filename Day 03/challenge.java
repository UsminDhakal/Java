import java.util.Scanner;
public class challenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of subject marks");
        int a = input.nextInt();
        System.out.println("Enter marks of second subject");
        int b = input.nextInt();
        int marks = (a+b) /2;
        System.out.println("The averagee marks is "+ marks);

    }
}