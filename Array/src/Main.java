import java.util.*;

//class Student{
//    int[] Roll = new int[6];
//
//}

public class Main {
    static void PrintArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] roll = new int[3];
        roll[0] = 1;
        roll[1] = 2;
        roll[2] = 3;
        PrintArray(roll);
        int[] roll2 = roll;
        roll2[1] = 4;
        PrintArray(roll);
        PrintArray(roll2);

        //To Solve this problem
        int[] roll3 = roll.clone();
        int[] roll4 = Arrays.copyOf(roll, roll.length);
        PrintArray(roll3);
    }
}