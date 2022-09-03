
import java.util.*;

class FirstClass {
    public static void main(String[] args) {
        System.out.println("Subham De");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println(name);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}