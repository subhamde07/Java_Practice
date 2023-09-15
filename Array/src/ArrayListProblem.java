import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProblem {

    static void reverseList(ArrayList<Integer> l) {
        int i = 0, j = l.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
        System.out.println(l);
    }

    static void sortList(ArrayList<Integer> l) {
        // Ascending Order
        Collections.sort(l);
        System.out.println(l);

        // Descending Order
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(30);
        l1.add(24);
        l1.add(5);
        l1.add(60);
        System.out.println(l1);

        reverseList(l1);

        Collections.reverse(l1); // Inbuilt method in java(Collections) to reverse the list
        System.out.println(l1);

        // Sort an ArrayList -->
        sortList(l1);

    }
}
