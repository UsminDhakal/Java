
class MyEmployee{
    private String name;
    private int id;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

}

public class accessmodifiers {
    public static void main(String[] args) {
        MyEmployee usmin = new MyEmployee();
        // usmin.name = "Usmin Dhakal";   //We cannot use this when it has private access modifier
        // usmin.id = 13;
        usmin.setName("Usmin Dhakal");
        usmin.setId(1);

        System.out.println("Name: " + usmin.getName() + " Id = " + usmin.getId());

    }    
}
