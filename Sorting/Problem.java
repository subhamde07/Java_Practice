public class Problem {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void sortAtLast(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){ 
            for(int j=0 ; j<n-1-i ; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 4, 2};
        printArray(arr);
        sortAtLast(arr);
        printArray(arr);
    }
}
