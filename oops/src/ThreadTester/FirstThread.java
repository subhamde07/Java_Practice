package ThreadTester;

public class FirstThread extends Thread {
//    @override
    public void run(){
        for(int i = 0; i < 5 ; i++){
            System.out.print(i + " ");
        }
    }
}
