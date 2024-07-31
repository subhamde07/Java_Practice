
class A{
    public static int fun(int a, int b){
        return a+b;
    }
}
public class Temp {
    public static void main(String[] args) {
        // 4 3 4 1 2 1
        // int[] arr = {4, 3, 4, 1, 2, 1};

        int c = A.fun(4, 5);
        System.out.println(c);
    }
}
