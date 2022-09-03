import java.util.*;
public class ArrayInJava {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < n; i++){
            arr[i] = Input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
