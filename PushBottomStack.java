import java.util.*;

public class PushBottomStack {
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.empty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(4, s);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
