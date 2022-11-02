public class Area {
    void area(int r){
        double ans = 3.14 * r * r;
        System.out.println("The area of the cycle is : " + ans );
    }
    void area(int b, int h){
        double ans = 0.5 * b * h;
        System.out.println("The area of the triangle is : " + ans);
    }
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.area(5);
        a1.area(5, 10);
    }
}
