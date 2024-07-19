
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class Queue {
    Node head = null;
    Node front, back;
    int size = 0;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            front = back = newNode;
            size++;
        } else {
            back.next = newNode;
            back = newNode;
            size++;
        }
    }

    public int dequeue() {
        if(front == null) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        int data = front.data;
        front = front.next;
        size--;
        return data;
    }

    public int peek() {
        if(front == null) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        return size;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!!");
            return;
        }

        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class LinkedListImplement {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.display();

    }
}
