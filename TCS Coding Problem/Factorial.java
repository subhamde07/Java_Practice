import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {

    public static int Fact(int n){
        if(n == 0) return 1;
        return n * Fact(n-1);
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(Fact(n));
        }
    }
}