import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // Add value in ArrayList
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(9);

        // Get a element at index i
        System.out.println(l1.get(2));

        // Print with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        // Print ArrayList directly
        System.out.println(l1);

        // add element at i index
        l1.add(2, 6);
        System.out.println(l1);

        // Modify element at i index
        l1.set(2, 10);
        System.out.println(l1);

        // Remove an element at index i
        l1.remove(2);
        System.out.println(l1);

        // Remove an element e
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);

        // Check if an element present or not
        System.out.println(l1.contains(Integer.valueOf(15)));

        // if you don't specify class, you can put anything
        ArrayList arr = new ArrayList();
        arr.add(4);
        arr.add("Subham");
        arr.add(true);
        System.out.println(arr);
    }
}
