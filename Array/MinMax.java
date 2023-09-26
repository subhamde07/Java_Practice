import java.util.*;

public class MinMax{

    static int[] smallestAndLargest(int[] arr){
        //1st Method

        // int[] minMax = new int[2];
        // minMax[0] = arr[0];
        // minMax[1] = arr[0];
        // for(int temp : arr){
        //     if (temp < minMax[0]){
        //         minMax[0] = temp;
        //     }
        //     else if(temp > minMax[1]){
        //         minMax[1] = temp;
        //     }
        // }

        // 2nd Method
        Arrays.sort(arr);
        int[] minMax = {arr[0], arr[arr.length-1]};
        
        return minMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of element in array. ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element.");
        for (int i=0;i<n ;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans = smallestAndLargest(arr).clone();
        System.out.println(ans[0] + " " + ans[1]);
    }
}