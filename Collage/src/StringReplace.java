import java.util.*;

public class StringReplace {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1, search, rep;

        System.out.println("Enter the String: ");
        s1 = input.nextLine();
        System.out.println("Enter the element to search: ");
        search = input.nextLine();
        System.out.println("Enter the character to replace : ");
        rep = input.nextLine();

        String ans = s1.replace(search, rep);
        System.out.println(ans);
    }
}
