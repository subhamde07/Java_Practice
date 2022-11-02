import java.util.*;

class Box{
    double length, breadth, height, volume;
    Box(){
        length = 0.0;
        breadth = 0.0;
        height = 0.0;
    }
    Box(double l){
        length = l;
        breadth = l;
        height = l;
    }
    Box(double x, double y, double z){
        length = x;
        breadth = y;
        height = z;
    }

    void Volume(){
        volume = length * breadth * height;
    }
    void Display(){
        System.out.println(volume);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of l : ");
        double l = input.nextDouble();

        System.out.println("Enter the value of x, y and z : ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        Box obj1 = new Box();
        obj1.Volume();
        obj1.Display();

        Box obj2 = new Box(l);
        obj2.Volume();
        obj2.Display();

        Box obj3 = new Box(x, y, z);
        obj3.Volume();
        obj3.Display();
    }
}
