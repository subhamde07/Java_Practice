class A{
    void add(int ... n){
        int sum = 0;
        for(int num : n){
            sum = sum + num;
        }
        System.out.println("Sum = "+sum);
    }
}

public class VarArgs {
    public static void main(String[] args) {
        A obj = new A();
        obj.add();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10, 20, 30, 40);
        obj.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
