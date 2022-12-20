
class Shape{
    String color;
    public void area{
        System.out.println("Display area : ");
    }
}

//Singal level inheritance -->
class Triangle extends Shape{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

//multilevel inheritance -->
class EquilateralTriangle extends Triangle {
    public void area(int l) {
        System.out.println(1/2*l*l);
    }
}

//Hierarchial inheritance -->
class Circle extends Shape{
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

public class Inheritance{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}