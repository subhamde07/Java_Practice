
public class Prefix {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void makePrefixSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i = 1 ; i<n ; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        printArray(ans);
    }

    static void makePrefixSumSameArray(int[] arr){
        int n = arr.length;
        for(int i=1 ; i<n ; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        printArray(arr);
    }

    static void makePrefixSumRange(int[] arr, int l, int r){
        for(int i = 1 ; i<r ; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        int ans = arr[r-1] - arr[l-2];
        System.out.println(ans);
    }

    static int totalSum(int[] arr){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }

    static boolean equalSumPartition(int[] arr){
        int sum = totalSum(arr);
        int prefix = 0;
        for(int i=0 ; i<arr.length ; i++){
            prefix += arr[i];
            int postfix = sum - prefix;
            if(postfix == prefix){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 10, 15};
        printArray(arr);
        makePrefixSum(arr);
        makePrefixSumSameArray(arr);

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        printArray(arr2);
        makePrefixSumRange(arr2, 2, 4);

        int arr3[] = {1, 1, 1, 1, 1, 1};
        System.out.println(equalSumPartition(arr3));
    }
}
