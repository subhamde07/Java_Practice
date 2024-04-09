
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class Stack{
    Node head = null;
    int size = 0;
    void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }
    int peek(){
        return head.data;
    }
    int pop(){
        if(head == null){
            System.out.println("Stack Underflow!");
            return -1;
        }
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }
    // boolean isFull(){

    // }
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    int size(){
        return size;
    }
    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        st.display();
    }
}
