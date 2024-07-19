import java.util.Scanner;

public class StarPattern {

    static void printStar1(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=n-1 ; j>=i ; j--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printStar2(int n){
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n / 2 + 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        int n = 5;
        
        printStar1(n);
    }
}
