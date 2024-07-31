public class VarArgs {

    static void add(int... n) {
        int sum = 0;
        for (int num : n) {
            sum = sum + num;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        add();
        add(1, 2);
        add(10, 20, 30, 40);
        add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
