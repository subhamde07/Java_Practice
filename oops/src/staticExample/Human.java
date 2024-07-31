package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    static int population;

    Human(int age, String name){
        this.age = age;
        this.name = name;
        salary += 1;
        population += 1;
    }
}
