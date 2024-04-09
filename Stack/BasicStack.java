import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        st.pop();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);
    }    
}
