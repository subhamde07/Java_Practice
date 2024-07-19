package SortingAlgo;

public class MergeSort {

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void Marge(int[] arr, int start, int mid, int end){
        int n1  = mid-start+1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0 ; i<n1 ; i++){
            left[i] = arr[start+i];
        }
        for(int i=0 ; i<n2 ; i++){
            right[i] = arr[mid+1+i];
        }

        int i=0, j=0, k=start;
        while ( i<n1 && j<n2 ){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            } else{
                arr[k++] = right[j++];
            }
        }
        while ( i < n1 ){
            arr[k++] = left[i++];
        }
        while ( j < n2 ){
            arr[k++] = right[j++];
        }
    }

    static void margeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = start + ((end-start) / 2);
            margeSort(arr, start, mid);
            margeSort(arr, mid+1, end);
            Marge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 6, 2, 4, 5};
        printArray(arr);
        margeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
