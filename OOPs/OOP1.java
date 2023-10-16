class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Constructor -->
    Student(){
        System.out.println("constructor called");
    }
}

class Student1{
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

// Copy Constructor -->
class Student3{
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student3(Student s3){
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class OOP1 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Subham De";
        s1.age = 21;
        s1.printInfo();

        Student1 s2 = new Student1("nothing", 21);
        s2.printInfo();

        Student3 s3 = new Student3(s1);
        s3.printInfo();
    }
}


// concepts -->
// 1.Polymorphism ->
