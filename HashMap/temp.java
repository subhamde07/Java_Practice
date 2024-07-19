import java.util.*;

public class temp {

    static int[] detectOdd(int n, int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        int i=0;
        for(int key : map.keySet()){
            if (map.get(key)%2 != 0) {
                ans[i++] = key;
            }
        }
        Arrays.sort(ans);
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4};

        System.out.println(detectOdd(arr.length, arr));

    }
}
