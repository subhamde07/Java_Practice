/*
 * Find Maximum Sum Sub Array ( kadane's Algorithm )
 * input : [ 1 -2 3 4 ]
 * Output : 7 ( 3+4 )
 */


public class SubArraySum {

    static int maxSumSubArray(int[] arr){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            curSum = curSum + arr[i];
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum <= 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 4};
        System.out.println(maxSumSubArray(arr));
    }
}