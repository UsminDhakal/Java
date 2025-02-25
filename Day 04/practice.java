public class practice{
    public static void main(String[] args) {

        //Qn 1
        String name = "Usmin Dhakal";
        name = name.toLowerCase();
        System.out.println(name);

        //QN2
        name = name.replace(" ", "_");
        System.out.println(name);

        //Qn3
        String text = "Dear <|name|>, Thanks a lot";
        text = text.replace("<|name|>", "Usmin");
        System.out.println(text);
    }
}