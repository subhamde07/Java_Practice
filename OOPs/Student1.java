public class Student1{
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Constructor -->
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
}