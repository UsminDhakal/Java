import java.util.Scanner;
public class strings{
    public static void main(String[] args) {
        String name = new String("Usmin");
        System.out.println(name);   // "%d used inside printf is format specifier"
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();  
        System.out.println(st);
    }
}