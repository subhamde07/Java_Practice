package JavaInterface;

interface Car{
    void color();
    void price();
}

class BMW implements Car {
    public void color(){
        System.out.println("Blue color");
    }
    public void price(){
        System.out.println(200000);
    }
    void fuel(){
        System.out.println("Petrol");
    }
}

public class Main {
    public static void main(String[] args) {
        BMW bw = new BMW();
        bw.price();
        bw.fuel();
    }
}
