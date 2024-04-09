
class Stack {
    // Stack(int size){
    //     int[] arr = new int[10];
    // }
    int[] arr = new int[5];
    int idx = 0;

    int size(){
        return idx;
    }
    void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow!");
            return;
        }
        arr[idx++] = val;
    }
    int peek(){
        if (idx == 0) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[idx-1];
    }
    int pop(){
        if (idx == 0) {
            System.out.println("Stack Underflow.");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }
    boolean isEmpty(){
        if (idx == 0) {
            return true;
        }
        return false;
    }
    boolean isFull(){
        if (idx == arr.length) {
            return true;
        }
        return false;
    }
    int capacity(){
        return arr.length;
    }
    void print(){
        if(isEmpty()){
            System.out.print("[]");
        }
        for(int i=0 ; i<idx ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.print();

        System.out.println(st.size());
        int x = st.pop();
        st.print();
        

        // System.out.println(st.size());
        // System.out.println(st.isEmpty());
        // System.out.println(st.isFull());
    }
}
