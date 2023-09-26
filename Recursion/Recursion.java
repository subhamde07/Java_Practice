import java.util.*;

public class Recursion{

    static void printNaturalNumber(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        // System.out.println(n);  // Print Number in Decreasing order
        printNaturalNumber(n-1);
        System.out.println(n);      // Print number in Increasing order
    }

    static int Factorial(int n){    // Time Complexity = O(n)
        if(n==1){
            return n;
        }
        return n * Factorial(n-1);
    }

    static int Fibonacci(int n){    // Time Complexity = O(2^n)
        if(n == 0 || n == 1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int Power(int n, int p){
        // First Approach -->
        // if(p == 0){
        //     return 1;
        // }
        // return Power(n, p-1) * n;

        // Second Approach -->
        if(p == 0){
            return 1;
        }
        int pow = Power(n, p/2);
        if(p % 2 == 0){
            return pow * pow;
        }
        return n * pow * pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        // printNaturalNumber(n);
        // System.out.println(Factorial(n));
        // System.out.println(Fibonacci(n));
        // System.out.println(sumOfDigits(n));
        System.out.println(Power(n, p));

    }
}