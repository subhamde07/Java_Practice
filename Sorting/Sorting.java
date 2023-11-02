public class Sorting {
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag){ break; } //For optimize code, break unused loop.
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;  // searching for lowest index
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1 ; i<n ; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    
    static void Merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++)
            left[i] = arr[l+i];
        for(int j=0;j<n2;j++) 
            right[j] = arr[mid+1+j];
        
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
    static void mergeSort(int[] arr, int l, int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        Merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 5, 2, 5, 3, 6 };
        printArray(arr);
        // bubbleSort(arr);  // Time Complexity = O(n^2)
        // selectionSort(arr);  // Time Complexity = O(n^2)
        // insertionSort(arr);  // Time Complexity = O(n^2) | O(n) [Bast Case]
        mergeSort(arr, 0, arr.length-1);    // Time Complexity = O(n log(n))
        printArray(arr);
    }
}