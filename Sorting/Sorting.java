public class Sorting {
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
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
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 5, 2, 5, 3, 6 };
        printArray(arr);
        bubbleSort(arr); // Time Complexity = 
    }
}