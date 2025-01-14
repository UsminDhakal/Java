import java.util.Scanner;
public class sumoftheenumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = input.nextInt();
        System.out.println("Enter 2nd number");
        int b = input.nextInt();
        System.out.println("Enter 3rd number");
        int c = input.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of three number is: "+ sum);
        
    }
}