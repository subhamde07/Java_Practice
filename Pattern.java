import java.util.*;

public class Pattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Hollow Rectangle
        System.out.println("Hollow Rectangle ==>");
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if (i ==1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Half Pyramidal
        System.out.println("Half Pyramidal ==>");
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Invert Half Pyramidal
        System.out.println("Invert Half Pyramidal ==>");
        for(int i = 1; i <= row; i++){
            for(int j = col; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // Invert Half Pyramidal rotated by 180 degrees
        System.out.println("Invert Half Pyramidal rotated by 180 degrees ==>");
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
