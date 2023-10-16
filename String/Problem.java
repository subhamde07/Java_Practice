import java.util.*;

public class Problem {
    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static void isPalindromicSubstring(StringBuilder str){
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<=str.length() ; j++){
                if(isPalindrome(str.substring(i, j))) count++;
            }
        }
        System.out.println(count);
    }
    static void countDuplicate(String str){
        StringBuilder sb = new StringBuilder("" + str.charAt(0));
        int count = 1;
        for(int i=0 ; i<str.length() ; i++){
            
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder str = new StringBuilder(sc.nextLine());

            // System.out.println(isPalindrome(str));
            isPalindromicSubstring(str);
            String sc = "aaabbbbccdddde";
            countDuplicate(sc);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
