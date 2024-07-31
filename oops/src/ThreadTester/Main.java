package ThreadTester;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Start...");

        Thread t1 = new FirstThread();
//        t1.setDaemon(true); // after exit the main thread will be stopped
        t1.start();

        System.out.println("Main Stop...");
    }
}
