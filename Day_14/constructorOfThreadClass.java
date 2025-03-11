class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run(){

        int i = 0;
        while (i<=1000) {
            System.out.println("I am a thread");
            i++;
            
        }

    }
}

public class constructorOfThreadClass {
    public static void main(String[] args) {
        MyThr th = new MyThr("Usmin");
        th.start();
        System.out.println("The id of the thread th is " + th.getId());
        System.out.println("The name of the thread th is " + th.getName());
        
    }
}