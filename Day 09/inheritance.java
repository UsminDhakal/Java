class Base{
    int x;
    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void display(){
        System.out.println("I am display method of base class");
    }
    
}


class Derived extends Base{

    
}

public class inheritance {
    public static void main(String[] args){


        Derived x = new Derived();
        x.display();


        x.setX(100);
        // int value = x.getX();
        System.out.println("The value of x = "+ x.getX());

    }    
}
