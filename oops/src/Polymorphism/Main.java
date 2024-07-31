package Polymorphism;

class Shape{
    void draw(){
        System.out.println("drawing...");
    }
}
class Rectangle extends Shape{
//    @Override   // this is called annotation
//    void draw(){
//        System.out.println("drawing rectangle...");
//    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("drawing circle...");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("drawing triangle...");
    }
}

// Method Overloading -->
class Number{
    void sum(){
        System.out.println("Nope!");
    }
    void sum(int x, int y){
        System.out.println( x+y );
    }
    void sum(int x, int y, int z){
        System.out.println( x+y+z );
    }
}

public class Main {
    public static void main(String[] args) {

        // Runtime/Dynamic polymorphism - Method overriding
        Shape shape = new Shape();
        Shape rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        shape.draw();
        rectangle.draw();
        circle.draw();
        triangle.draw();

        // Compiled time polymorphism - Method overloading
        Number num = new Number();
        num.sum();
        num.sum(2, 3);
        num.sum(2, 4, 6);



    }
}
