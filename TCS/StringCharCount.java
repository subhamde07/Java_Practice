/* 
 * 
 * 1. Write A program for finding occurrence of each character in input String.
 * Input : “code bashers”
 * Output : c=1,o=1,d=1,e=2,b=1,a=1,s=2,h=1,r=1
 * 
*/


import java.util.*;

public class StringCharCount {
    public static void main(String[] args) {
        String s = "code bashers";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get('c') + 1);
            }
        }

        for (var i : map.entrySet()) {
            System.out.println(i.getKey() + " = " + i.getValue());
        }
        System.out.println(Collections.singletonList(map));
    }
}
