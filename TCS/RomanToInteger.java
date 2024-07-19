import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans=0;

        for(int i=0 ; i<s.length()-1 ; i++){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i+1))){
                ans += map.get(s.charAt(i));
            } else{
                ans -= map.get(s.charAt(i));
            }
            
        }
        ans += map.get(s.charAt(s.length()-1));
        return ans;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Solution s = new Solution();
        // Scanner sc = new Scanner(System.in);
        // String st = sc.nextLine();
        System.out.println(s.romanToInt("VICXMCM"));
    }
}