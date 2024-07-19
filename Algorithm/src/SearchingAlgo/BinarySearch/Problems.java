package SearchingAlgo.BinarySearch;

public class Problems {
    public static int firstOccurence(int[] arr, int value){
        int first = 0, last = arr.length-1;
        int fo = -1;
        while( first <= last ){
            int mid = first + (last - first) / 2;
            if( arr[mid] == value ){
                fo = mid;
                last = mid - 1;
            } else if( value < arr[mid] ){
                last = mid - 1;
            } else{
                first = mid + 1;
            }
        }
        return fo+1;
    }
    public static int lastOccurence(int[] arr, int value){
        int first = 0, last = arr.length-1;
        int lo = -1;
        while(first <= last){
            int mid = first + (last - first) / 2;
            if(arr[mid] == value){
                lo = mid;
                first = mid + 1;
            } else if ( value > arr[mid] ){
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return lo+1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7};
        int val = 3;
        System.out.println(firstOccurence(arr, val));
        System.out.println(lastOccurence(arr, val));
        
    }
}
