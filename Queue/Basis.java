import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Basis {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Character> temp1 = new ArrayDeque<>();
        Queue<Character> temp2 = new PriorityQueue<>();

        q.add(2);
        q.add(3);
        q.add(1);
        System.err.println(q);

        temp1.add('A');
        temp1.add('B');
        System.err.println(temp1);

        temp2.add('a');
        temp2.add('b');
        System.out.println(temp2);

        System.out.println(q.peek());   // return Topmost element

        // q.remove();      // Gives error when Queue empty.
        q.poll();           // return null when queue empty.
        System.out.println(q);

        System.out.println(q.isEmpty());
        System.out.println(q.size());

        // temp1.removeIf('B');
        // System.out.println(temp1);

    }
}