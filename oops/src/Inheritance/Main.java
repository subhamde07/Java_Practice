package Inheritance;



class Employee { // parents Class
    int id;
    String name;
    int salary;

    Employee() {
        this.id = 10;
        this.name = "Subham";
        this.salary = 10000;
    }
    Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void print() {
        System.out.println("Employee");
    }
}

class Employee1{ // Parents class
    void print() {
        System.out.println("Employee1");
    }
}

// Inherited or Child Class
class Engineer extends Employee {
    int roll;
    Engineer(int id, int salary, int roll) {
        super(id, salary);
        this.roll = roll;
        System.out.println(super.id);
    }
    Engineer(int roll){
        this.roll = roll;
    }
}

// Multilevel Inheritance
class Stream extends Engineer{
    String stream;
    Stream(int roll, String stream) {
        super(roll);
        this.stream = stream;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee em = new Employee();
        System.out.println(em.name);

        Engineer eng = new Engineer(20, 1000, 1);
        System.out.println(eng.id + " " + eng.roll);

        Employee em2 = new Engineer(30, 50000, 2);
        System.out.println(em2.id);
        //System.out.println(em2.roll);   // It's gives error because em2 cant access child class.
        // create a reference of Employee class through child class Engineer using SUPER keyword.

        //Engineer eng2 = new Employee(40, 50000);  // Gives error because parent class is not access child class
        // Engineer = Reference && eng2 = reference variable

    }
}
