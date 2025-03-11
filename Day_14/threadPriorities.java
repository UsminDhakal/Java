class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run(){

        int i = 0;
        while (i<=100) {
            System.out.println("I am a thread"+ this.getName());
            i++;
            
        }

    }
}

public class threadPriorities {
    public static void main(String[] args) {
        MyThr1 th1 = new MyThr1("Usmin1"); 
        MyThr1 th2 = new MyThr1("Usmin2"); 
        MyThr1 th3 = new MyThr1("Usmin3"); 
        MyThr1 th4 = new MyThr1("Usmin4"); 
        MyThr1 th5= new MyThr1("Usmin5  Most Important"); 

        th5.setPriority(Thread.MAX_PRIORITY);
        th4.setPriority(Thread.MIN_PRIORITY);
        th3.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th1.setPriority(6);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();


    }
}
