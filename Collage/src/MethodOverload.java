import java.util.*;

class Figure{
    int dim1, dim2;
    void Area(){
        System.out.println("Area of Figure");
    }
    Figure(int a, int b){
        dim1 = a;
        dim2 = b;
    }
}

class Rectangle extends Figure{
    Rectangle(int a, int b){
        super(a, b);
    }
    void Area(){
        System.out.println("Area of Ractangle : " + dim1*dim2);
    }
}

class Triangle extends Figure{
    Triangle(int a, int b){
        super(a, b);
    }
    void Area(){
        System.out.println("Area of Triangle : " + (dim1*dim2*0.5));
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(10, 20);
        obj1.Area();
        Triangle obj2 = new Triangle(5, 4);
        obj2.Area();
    }
}
