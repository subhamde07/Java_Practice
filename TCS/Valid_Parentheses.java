import java.util.*;
import java.util.Stack;

public class Valid_Parentheses {

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            } else if(c == '{'){
                st.push('}');
            }else if(c == '['){
                st.push(']');
            } else if(st.isEmpty() || st.pop() != c){
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isValid(s));

    }
}
