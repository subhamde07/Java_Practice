import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" number : ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(int i = 0;i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
