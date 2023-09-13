import java.util.*;

public class TwoPointer {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 

    static void sortArray(int[] arr){
        int l = arr.length;
        int left = 0;
        int right = l-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
        printArray(arr);
    }

    static void sortArrayOddEven(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 ==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 ==0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {0, 0, 1, 1, 0, 1, 1};
        printArray(arr);
        sortArray(arr);

        int arr2[] = {1, 2, 3, 4, 5, 6};
        sortArrayOddEven(arr2);
    }
}
