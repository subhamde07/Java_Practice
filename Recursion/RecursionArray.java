import java.util.*;

public class RecursionArray {

    static void printArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx+1);
    }

    static int findMax(int[] arr, int idx){
        // Base Case
        if(idx == arr.length-1){
            return arr[idx];
        }
        // small problem
        int ans = findMax(arr, idx+1);
        return Math.max(arr[idx], ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        int[] arr = {3, 4, 5, 6};

        printArray(arr, 0);
        System.out.println();
        System.out.println(findMax(arr, 0));
    }
}
