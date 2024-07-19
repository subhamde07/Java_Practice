package SearchingAlgo.BinarySearch;

public class Main {

    static boolean binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;

        while ( start <= end ){
            int mid = start + (end - start) / 2;    // int mid = (start + end) / 2; [Both are Same]
            if(arr[mid] == target){
                return true;
            } else if( arr[mid] < target ) {
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }       // Time Complexity = O(logN)

    static boolean recursiveBinarySearch(int[] arr, int start, int end, int target){
        if ( start > end ){
            return false;
        }       // Base Case

        int mid = start + ((end - start) / 2);
        if( target == arr[mid] ){
            return true;
        } else if( target < arr[mid] ) {
            return recursiveBinarySearch(arr, start, mid-1, target);
        } else {
            return recursiveBinarySearch(arr, mid+1, end, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        System.out.println(binarySearch(arr, target));
//        System.out.println(recursiveBinarySearch(arr, 0, arr.length-1, target));
    }
}
