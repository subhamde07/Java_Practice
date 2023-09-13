import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();    // declaring ArrayList
        ArrayList<String> list2 = new ArrayList<>();

        // Add element -->
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println(list);

        // Get element -->
        int x = list.get(1);
        System.out.println(x);

        // Add element in between -->
        list.add(2, 2);
        System.out.println(list);

        // Set element --> replace element
        list.set(1, 5);
        System.out.println(list);

        // Delete element -->
        list.remove(1);
        System.out.println(list);

        // Size count -->
        int size = list.size();
        System.out.println(size);

        // loops -->
        for(int i = 0; i<list.size();i++) {
            System.out.println(list.get(i));
        }

        // Sorting -->
        Collections.sort(list);
        System.out.println(list);

        //Present or not -->
        System.out.println(list.contains(4));
    }
}
