package CodeChef;

import java.util.*;

public class Lead_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of round.
        int p1=0, p2=0, maxans=0;
        while((n--)!=0){
            p1 = p1 + sc.nextInt();
            p2 = p2 + sc.nextInt();

            int top = Math.abs(p1-p2);
            if(maxans>top){
                maxans = top;
            }
        }
        if(maxans>0){
            System.out.println("1" + maxans);
        }
        else{
            System.out.println("2" + maxans);
        }
    }
}
