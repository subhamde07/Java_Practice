import java.util.HashSet;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        
        int maxLen = 0;
        for(int n : set){
            if(!set.contains(n - 1)){
                int currNum = n;
                int currLen = 1;
                while(set.contains(currNum+1)){
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {100,4,200,1,3,2};
        int[] arr2 = {2, 5, 8, 10};
        int[] arr3 = {100};
        int[] arr4 = {};
        System.out.println(longestConsecutive(arr1));
        System.out.println(longestConsecutive(arr2));
        System.out.println(longestConsecutive(arr3));
        System.out.println(longestConsecutive(arr4));
    }
}
