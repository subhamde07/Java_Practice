import java.util.*;

class Room {
    int height, length, breadth;

    void getValue(int l, int b, int h) {
        length = l;
        height = h;
        breadth = b;
    }

    void Volume() {
        int v = length * breadth * height;
        System.out.println("Volume = " + v);
    }
}

public class ClassRoom {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = input.nextInt();
        System.out.print("Enter Breadth: ");
        int b = input.nextInt();
        System.out.print("Enter Height: ");
        int h = input.nextInt();

        Room rm = new Room();
        rm.getValue(l, b, h);
        rm.Volume();
    }
}
