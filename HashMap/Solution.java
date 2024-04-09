import java.util.*;

class Solution {
    static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        int l = s.length();

        for(int i = 0 ; i<l ; i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            } else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            if(!map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i), 1);
            } else{
                map1.put(t.charAt(i), map1.get(t.charAt(i))+1);
            }
        }

        for(var e : map.keySet()){
            if(map.get(e) % 2 != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";

        System.out.println(isAnagram(s, t));
    }
}