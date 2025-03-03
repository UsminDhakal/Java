
class MyEmployee{
    private String name;
    private int id;
    private double salary;
    private String address;

    public MyEmployee(String name, double salary, String address){
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public MyEmployee(String name, double salary, int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

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

public class constructors {
    public static void main(String[] args) {
        MyEmployee usmin = new MyEmployee("Usmin", 1000, "Biratnagar");
        System.out.println(usmin.getName());

        MyEmployee emp = new MyEmployee("Usmin", 1000, 1);
        System.out.println(emp.getId());


    }    
}
