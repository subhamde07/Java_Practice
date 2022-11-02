import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two number : ");
        a = input.nextInt();
        b = input.nextInt();

        try{
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("Error because : ");
            System.out.println(e);
        }
        System.out.println("End of this program");
    }
}
