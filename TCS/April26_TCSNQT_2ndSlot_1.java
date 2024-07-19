// Print the sum of cube in the range.

import java.util.Scanner;

public class April26_TCSNQT_2ndSlot_1 {

    static int cube(int n, int m){
        if(m < n){
            return 0;
        }
        int sum = 0;
        for(int i = n; i <= m; i++){
            sum += (i * i * i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(cube(n, m));
    }
}
