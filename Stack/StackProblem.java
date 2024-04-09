import java.util.Stack;


public class StackProblem {

    static boolean balancedBracket(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i);
            if(c == '('){
                st.push(c);
            }
            else{
                if(st.size() == 0){
                    return false;
                }
                if(st.peek() == ')'){
                    st.pop();
                }
            }
        }
        if(st.size() > 0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {

        String s = "()(())()" ;

        System.out.println(balancedBracket(s));

    }
}
