import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s1 = input.nextLine();
        int flag = 1;
        for (int i = 0; i < s1.length()/2; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length()-1-i)){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("It is Palindrome.");
        }
        else{
            System.out.println("it is not palindrome.");
        }
    }
}
