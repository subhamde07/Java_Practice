import java.util.*;
public class PrintStar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int starX = input.nextInt();
        int starY = input.nextInt();
        for(int i=1 ; i<=starX ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
