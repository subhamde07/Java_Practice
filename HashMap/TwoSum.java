import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        // Brute Force -->
        // int[] ans = {-1};
        // for(int i=0 ; i<nums.length-1 ; i++){
        //     for(int j=i+1 ; j<nums.length ; j++){
        //         if(target-nums[i] == nums[j]){
        //             ans =  new int[]{i , j};
        //             break;
        //         }
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1};
        for (int i=0 ; i<nums.length ; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            } else {
                ans = new int[] {map.get(target - nums[i]), i};
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int[] num2 = { 3, 2, 4};
        int[] num3 = { 3, 3};

        System.out.println(twoSum(num, 9));     // [0, 1]
        System.out.println(twoSum(num2, 6));     // [1, 2]
        System.out.println(twoSum(num3, 6));     // [0, 1]
    }
}
