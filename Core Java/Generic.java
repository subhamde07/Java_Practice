
/*
 * T = Generic
 * we are use generic in Collection framework.
 */

class Box<T> {
    T container;

    public Box(T container) {
        this.container = container;
    }

    public T getValue() {
        return this.container;
    }
}

public class Generic {
    public static void main(String[] args) {
        Box<String> box = new Box<>("Hello");
        System.out.println(box.getValue());

        Box<Integer> box1 = new Box<>(2002);
        System.out.println(box1.getValue());
    }
}