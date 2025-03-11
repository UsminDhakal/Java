
class MyNewThr1 extends Thread{
  

    @Override
    public void run(){

        int i = 0;
        while (i<=100) {
            System.out.println("I am a thread 1");
            try{
                Thread.sleep(500);

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            
        }

    }
}

class MyNewThr2 extends Thread{
 

    @Override
    public void run(){

        int i = 0;
        while (i<=100) {
            System.out.println("I am a thread");
            i++;
            
        }

    }
}


public class threadMethods {
    public static void main(String[] args) {

        MyNewThr1 th1 = new MyNewThr1();
        MyNewThr2 th2 = new MyNewThr2();

        // th1.start();

        // try{
        //     th1.join();  //th1.join() lai jaile pani try class vitra rakhnu parxa  join garim vane th1 ko execution suru ma complete hunxa

        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // th2.start();



        th1.start();
        th2.start();

        
    }
}
