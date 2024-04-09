import java.util.Stack;
import java.util.Scanner;

public class StackOperation {
    static void moveStack(Stack<Integer> st){
        // TODO
    }
    static void reverseStack(Stack<Integer> st){
        while(st.size() == 1){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertLast(st, top);
    }

    static Stack<Integer> insertLast(Stack<Integer> st, int val){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        return  st;
    }

    static void insertAnyIndex(Stack<Integer> st, int element, int position){
        Stack<Integer> temp = new Stack<>();
        int pos = st.size() - position + 1;
        while(!st.isEmpty() && pos != 0) {
            temp.push(st.pop());
            pos--;
        }
        st.push(element);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> st = new Stack<>();
            // System.out.println("Number of element: ");
            int n = sc.nextInt();
            // System.out.println("Enter the elements: ");
            while (n != 0) {
                int num = sc.nextInt();
                st.push(num);
                n--;
            }
            System.out.println(st);
            // moveStack(st);
            // System.out.println("Enter your Number and position :");
            // int ele = sc.nextInt(), pos = sc.nextInt();
            // insertAnyIndex(st, ele, pos);
            // System.out.println(st);
            reverseStack(st);
            System.out.println(st);
            
        }
    }
}
