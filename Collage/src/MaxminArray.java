import java.util.*;

public class MaxminArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" number : ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++){
            if(max<arr[i])
                max = arr[i];
            if(min>arr[i])
                min = arr[i];
        }
        System.out.println("The maximum number is : " + max);
        System.out.println("The minimum number is : " + min);
    }
}
