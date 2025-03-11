class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<= 1000){
            System.out.println("I am thread 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<= 1000){
            System.out.println("I am thread 2");
            i++;
        }
    }
}

public class threadUsingRunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread th1 = new Thread(t1);

        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();

    }
    
}