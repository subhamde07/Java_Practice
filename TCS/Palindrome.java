public class Palindrome {

    public static boolean isPalindrome(String s) {
        int f = 0;
        int l = s.length() - 1;
        while (f < l) {
            if (s.charAt(f) != s.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "subbus";
        System.out.println(isPalindrome(s));
    }
}