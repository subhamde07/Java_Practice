import java.util.*;
class Room {
    double height, length, breadth;

    void getValue(double l, double b, double h) {
        length = l;
        height = h;
        breadth = b;
    }

    void Volume() {
        double v = length * breadth * height;
        System.out.println("Volume = " + v);
    }
}

public class ClassRoom {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = input.nextDouble();
        System.out.print("Enter Breadth: ");
        double b = input.nextDouble();
        System.out.print("Enter Height: ");
        double h = input.nextDouble();

        Room rm = new Room();
        rm.getValue(l, b, h);
        rm.Volume();
    }
}
