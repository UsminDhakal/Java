
interface Parent {
    void meth1();

    // void meth2();
}

class AnaonymousDemo implements Parent {
    public void Display() {
        System.out.println("Hello ananymous");
    }

    @Override
    public void meth1() {
        System.out.println("Meth 1");
    }

    // @Override
    // public void meth2() {
    //     System.out.println("Meth 2");
    // }
}

public class AnonymousClassAndLambdaExpression {

    public static void main(String[] args) {

        Parent obj = new Parent(){
            @Override
            public void meth1(){
                System.out.println("MEth 1");
            }

            // @Override
            // public void meth2(){
            //     System.out.println("Meth2");
            // }
        };

        obj.meth1();
        // obj.meth2();


        // AnaonymousDemo obj2 = new AnaonymousDemo();
        // obj2.meth1();
        

        Parent obj2 = ()->{
            System.out.println("I am method 1");
        };

        obj2.meth1();


    }
}
