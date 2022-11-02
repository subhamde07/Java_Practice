import java.util.*;
class Arithmetic {
    int a, b;
    void getValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void Add() {
        System.out.println(a + b);
    }
    void Sub() {
        System.out.println(a - b);
    }
    void Mul() {
        System.out.println(a * b);
    }
    void Div() {
        System.out.println(a / b);
    }
}

public class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        Arithmetic at = new Arithmetic();
        at.getValue(a, b);

        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Divide\nEnter Your Choice: ");
        int temp = input.nextInt();
        switch (temp) {
            case 1 -> at.Add();
            case 2 -> at.Sub();
            case 3 -> at.Mul();
            case 4 -> at.Div();
            default -> System.exit(0);
        }
    }
}
