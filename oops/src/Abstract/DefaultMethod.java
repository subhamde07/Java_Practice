package Abstract;

interface Parent{
    default void sayHello(){
        System.out.println("Parent says Hello.");
    }
}

class Child implements Parent{

}

// Multiple Inheritance
interface Parents2{
    default void sayHello(){
        System.out.println("Parent says Hello.");
    }
}

public class DefaultMethod implements Parent, Parents2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();

        Parent p = new Child();
        p.sayHello();

    }

    // On that situation Override the method on the main class
    @Override
    public void sayHello() {
        Parent.super.sayHello();
    }
}
