class MyThread extends Thread{
    
    @Override
    public void run(){
        int i = 0;
        while(i<= 1000){
            System.out.println("My thread is running");
            System.out.println("I am chatting");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    
    @Override
    public void run(){
        int i = 0;
        while(i<=1000){
            System.out.println("My cooking thread2 is running");
            System.out.println("I am cooking food");
            i++;
        }
    }
}

public class extendingThread {
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
    
}
