// package LinkedList;
public class BasicLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void Display(Node head) {
        // Using Recursion -->
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        Display(head.next);

        // Using While Loop
        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }
    }

    public static void reverseDisplay(Node head) {
        if (head == null) {
            return;
        }
        reverseDisplay(head.next);
        System.out.print(head.data + " ");
    }

    public static void Count(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        System.out.println("Length = " + count);
    }

    public static void InsertAtEnd(Node head) {
        // TODO
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(a);
        System.out.println(a.data);

        System.out.println(a.next);
        System.out.println(b);

        System.out.println(b.data);
        System.out.println(a.next.data);

        Display(a);
        System.out.println();
        reverseDisplay(a);
        System.out.println();
        Count(a);

    }
}