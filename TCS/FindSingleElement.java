/*
 * Find the element that appears once in the array and rest all appears twice.
 * 
 * Input : [ 1 1 2 3 3 4 4 ]
 * Output : 2
 */

public class FindSingleElement {

    static int findElement(int[] arr){
        int result = 0;
        for(int i : arr){
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println("Single element is = " + findElement(arr));
    }
}
