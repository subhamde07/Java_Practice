package SortingAlgo;

public class InsertionSort {

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 2, 4, 5};

        for(int i=1 ; i<arr.length ; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j-1] ){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        printArray(arr);
    }
}
