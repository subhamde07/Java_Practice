package SortingAlgo;

public class QuickSort {

    static void print(int[] arr){
        for ( int i : arr ){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int st, int lt){
        int temp = arr[st];
        arr[st] = arr[lt];
        arr[lt] = temp;
    }

    static int partition(int[] arr, int st, int lt){
        // for the pivot index in the write position.
        int pi = arr[st];
        int count = 0;
        for(int i = st+1 ; i <= lt ; i++){
            if(pi > arr[i]){
                count++;
            }
        }
        int piIdx = st + count;
        swap(arr, st, piIdx);

        // Make sure that the smallest element left side of the array.
        int i = st, j = lt;
        while( i<piIdx && j>piIdx ){
            while(arr[i] <= pi) i++;
            while(arr[j] > pi) j--;
            if(i<piIdx && j>piIdx) {
                swap(arr, i, j);
                i++; j--;
            }
        }

        return piIdx;
    }

    static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7, 1, 6, 3};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
