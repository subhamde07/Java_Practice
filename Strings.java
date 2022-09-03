import java.util.*;

public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("name is "+name);

        String firstName = "subham";
        String lastName = "De";
        String fullName = firstName + "@" + lastName;
        System.out.println(firstName+" "+lastName);

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        String name1 = "subham";
        String name2 = "subham";
        // boolean a = name1.compareTo(name2);
        if(name1.compareTo(name2)==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


        String sentence = "Subham De";
        System.out.println(sentence.substring(7, sentence.length()));
        System.out.println(sentence.substring(0, 7));
    }
}
