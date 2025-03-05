interface SampleInterface{
    void meth1();
    void meth2();
}

interface childInterface extends SampleInterface{
    void meth3();
    void meth4();
}

class SampleClass implements childInterface{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){   
        System.out.println("Meth2");

        
    }
    public void meth3(){
        System.out.println("Meth3");
        
    }
    public void meth4(){
        System.out.println("Meth4");
        
    }
}
public class inheritanceInInterfaces {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.meth1();
    }
}
