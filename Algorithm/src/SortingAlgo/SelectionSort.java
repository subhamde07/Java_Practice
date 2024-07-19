package SortingAlgo;

public class SelectionSort {

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 2, 4, 5};

        for(int i=0 ; i<arr.length-1 ; i++){
            int min = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }

        printArray(arr);
    }
}
