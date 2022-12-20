import java.util.*;

class Employee{
    protected String name;
    protected int age;
    Employee(String x, int a){
        name = x;
        age = a;
    }
    void Display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Worker extends Employee{
    int hoursWorked;
    int salaryPerHour;
    Worker(String x, int a, int h, int s){
        super(x, a);
        hoursWorked = h;
        salaryPerHour = s;
    }
    void Salary(){
        System.out.println(hoursWorked * salaryPerHour);
    }
    void Display(){
        super.Display();
        System.out.println(hoursWorked);
        System.out.println(salaryPerHour);
        Salary();
    }
}

class Manager extends Employee{
    String department;
    int salary;
    Manager(String x, int a, String d, int s){
        super(x, a);
        department = d;
        salary = s;
    }
    void Display(){
        super.Display();
        System.out.println(department);
        System.out.println(salary);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Manager obj1 = new Manager("Subham", 43, "CSE", 45000);
        obj1.Display();

        Worker obj2 = new Worker("shahobaz", 25, 40, 3000);
        obj2.Display();
    }
}
