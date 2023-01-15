import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);
        
        list.addLast(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0 ; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
