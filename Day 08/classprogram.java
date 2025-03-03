class Employee{
    int id;   //attribute
    String name;
    double salary;


    public void display(){     //Methods
        System.out.println("The name of employee is " + name);
    }

    public void setSalary(double salary){
        this.salary = salary;

    }

    public double getSalary(){
        return salary;
    }
}

public class classprogram {
    public static void main(String[] args){
        System.out.println("Default class");
        Employee usmin = new Employee();   //Instantiating new Employee Object


        //Setting attributes
        usmin.id = 1;
        usmin.name = "Usmin Dhakal";

        System.out.println("Employee name is " + usmin.name + " and id is " + usmin.id);
        usmin.setSalary(10000);


        System.out.println("Salary = "+usmin.getSalary());


        usmin.display();
    }
}


