import java.util.HashMap;
import java.util.HashSet;


public class Test {
    static String gcdOfStrings(String s1, String s2){  
        StringBuilder str = new StringBuilder();

        HashSet<Character> st1 = new HashSet<>();
        HashSet<Character> st2 = new HashSet<>();
        for(char c : s1.toCharArray()){
            st1.add(c);
        }
        for(char c : s2.toCharArray()){
            st2.add(c);
        }

        for(char c : st1){
            if(st2.contains(c)){
                str.append(c);
            }
        }

        return str.toString();

    }
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "AB";

        System.out.println(gcdOfStrings(str1, str2));
    }
}
