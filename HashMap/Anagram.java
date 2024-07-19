// LeetCode - 242 : https://leetcode.com/problems/valid-anagram/

import java.util.*;
public class Anagram {

    // Method : 1   ------>
    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            Character ch = str.charAt(i);
            if(!freq.containsKey(ch)){
                freq.put(ch, 1);
            } else{
                freq.put(ch, freq.get(ch) + 1);
            }
        }
        return freq;
    }
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = makeFreqMap(s);
        HashMap<Character, Integer> map2 = makeFreqMap(t);
        return map1.equals(map2);
    }


    // Method : 2 ----->

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("cat", "rat"));
        System.out.println(isAnagram("anagram", "gram"));
        System.out.println(isAnagram("aaa", "bbb"));

    }
}
