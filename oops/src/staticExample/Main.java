package staticExample;

public class Main {
    public static void main(String[] args) {
        Human subham = new Human(12, "subham");
        Human subham2 = new Human(12, "subham2");

        System.out.println(subham.salary);
        System.out.println(subham2.salary);

        System.out.println(subham.population);  // Static member 'staticExample.Human.population' accessed via instance reference
        System.out.println(Human.population); // Best way to write objects with class name like = Human

        // fun();  // It gives error because "Non-static method 'fun()' cannot be referenced from a static context"
        Main obj = new Main(); // In this line we create an instance reference on Main class so its doesn't give error.
        obj.fun();

    }

    void fun() {
        System.out.println("Non static function.");
    }
}
