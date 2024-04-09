
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // int size(){
    //     Node temp = head;
    //     int count = 0;
    //     while (temp != null) {
    //         count++;
    //         temp = temp.next;
    //     }
    //     return count;
    // }

    void add(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
        }else{
            tail.next = temp;
        }
        tail = temp;
        size++;
    }
    void addFirst(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void InsertAt(int loc, int val){
        Node data = new Node(val);
        if(loc == size){
            // tail = data;
            add(val);   // Both are correct (Add at the last of linked list)
            return;
        }else if (loc == 0) {
            addFirst(val);      // Add at the first point of linked list;
            return;
        }else if (loc < 0 || loc > size) {
            System.out.println("Wrong Index.");
        }

        Node temp = head;
        while(loc-- != 1){
            temp=temp.next;
        }
        data.next = temp.next;
        temp.next = data;
        size++;
    }
    int getElement(int loc){
        if (loc < 0 || loc > size) {
            System.out.println("Wrong Index.");
            return -1;
        }
        Node temp = head;
        while (loc-- != 1) {
            temp = temp.next;
        }
        return temp.data;
    }
    void deleteAt(int loc){
        if (loc <= 0 || loc > size) {
            System.out.println("Wrong Index, Delete 1 to " + size);
            return;
        }else if (loc == 1) {
            head = head.next;
            return;
        }else if (loc == size) {
            
        }
        Node temp = head;
        while (loc-- != 2) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        size--;
    }
}
public class OwnLLClass {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(7);
        ll.add(8);
        ll.addFirst(3);
        ll.display();
        System.out.println("Length = " + ll.size);
        ll.InsertAt(3, 6);
        ll.InsertAt(0, 2);
        ll.InsertAt(7, 9);
        ll.display();
        System.out.println(ll.getElement(3));
        System.out.println(ll.size);
        ll.deleteAt(4);
        ll.display();
    }
}
