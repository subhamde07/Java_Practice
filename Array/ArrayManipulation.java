import java.util.*;

public class ArrayManipulation {

    public static void printArray(int[] arr){
        for (int i=0 ; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findUnique(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
            continue;
        }
        System.out.println();
    }

    public static int findMax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            continue;
        }
        return max;
    }

    public static int secondLargest(int[] arr){
        int[] tempArr = arr.clone();
        int mx = findMax(tempArr);
        for (int i=0 ; i<tempArr.length ; i++) {
            if(tempArr[i] == mx){
                tempArr[i] = Integer.MIN_VALUE;
            }
        }
        int max = findMax(tempArr);
        return max;
    }

    // public static int firstRepeat(int[] arr){
    //     int ans = -1;

    //     return ans;
    // }

    public static int[] rotate(int[] arr, int k){
        int n = arr.length;
        int[] ans = new int[n]; 
        k = n%k;
        int j = 0;  //Pointer of Ans array
        for(int i = n-k;i<n;i++){
            ans[j++] = arr[i]; 
        }
        for(int i = 0 ; i<n-k ; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 4, 2, 10, 1, 3 };
        printArray(arr);

        findUnique(arr);
        System.out.println("The maximum value is : " + findMax(arr) );
        System.out.println("The second maximum value is : " + secondLargest(arr) );
        // System.out.println("First repeating value : " + firstRepeat(arr));

        printArray(arr);
        
        printArray(rotate(arr, 4));
    }
}
