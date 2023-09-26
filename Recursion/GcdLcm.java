import java.util.Scanner;

public class GcdLcm {
    // First Approach
    static void BruteForceApproach(int x, int y){
        for(int i = Math.min(x, y) ; i>0 ; i--){
            if(x % i == 0 && y % i == 0){
                System.out.println(i);
                return;
            }
        }
    }

    // Second Approach
    static void LongDivisionApproach(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        System.out.println(y);
    }

    // Third Method
    static int EuclidApproach(int x, int y){
        if(y == 0){
            return x;
        }
        return EuclidApproach(y, x % y);
    }

    // LCM
    static void LCM(int x, int y, int z){
        // LCM = (x * y) / GCD(x, y)
        System.out.println((x * y) / z);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // GCD -->
        BruteForceApproach(x, y);
        LongDivisionApproach(x, y);
        System.out.println(EuclidApproach(x, y));

        // LCM
        LCM(x, y, EuclidApproach(x, y));
    }
}
