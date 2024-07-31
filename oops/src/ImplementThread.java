
class MyThread implements Runnable{
    @Override
    public void run() {
        for ( int i=1 ; i<=10 ; i++ ){
            System.out.println("MyThread: " +  i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyAnotherThread extends Thread{
    @Override
    public void run() {
        for ( int i = 10 ; i>= 1 ; i--){
            System.out.println("MyAnotherThread: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ImplementThread {
    public static void main(String[] args) {
        // Create Thread using Runnable Interface
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);

        // Create Thread using Thread Class
        Thread t2 = new MyAnotherThread();

        Thread t = Thread.currentThread();
        System.out.println("Thread Name: " + t.getName());
//        System.out.println("Thread ID: " + t.getId());

        thread.start();
        t2.start();

    }
}
