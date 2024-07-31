package Abstract;

abstract class Car{
    abstract public void FuelType();
    public void color(){
        System.out.println("Wine Red.");
    }
    public void price(){
        System.out.println("Wine Green.");
    };
}

class Tata extends Car{
    public void FuelType(){
        System.out.println("Petrol");
    }
//    public void price(){
//        System.out.println("Petrol");
//    };
}

public class Main {
    public static void main(String[] args) {
        Tata tt = new Tata();
        tt.FuelType();
        tt.color();
    }
}
