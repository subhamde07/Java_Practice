import java.util.*;

public class CodeChef_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int A = sc.nextInt();
            int Y = A%3;

            int X = (A+Y)/3;
            int Z = 100 - (Y + X); 

            System.out.println(X);
        }
    }
}