// import java.util.*;

public class Strings {

    static void PW(){
        String str = "Subham De Physics Wallah";
        System.out.println(str.contains("Phy"));  // Sub string available or not
        System.out.println(str.startsWith("S"));       // start with or not
        System.out.println(str.endsWith("s"));       // end with or not
        System.out.println(str.toUpperCase());
    }
    static void equals(){
        String s1 = "Hello" ;
        String s2 = "Hello";
        String s3 = new String ("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);       // == check address
        System.out.println(s1.equals(s3));  // .equal check value
    }

    public static void main(String[] args){
        String firstName = "Subham";
        String lastName = "De";
        System.out.println(firstName.charAt(2));
        System.out.println(firstName+" "+lastName);

        String n1 = "Subham";
        String n2 = "Pubham";
        System.out.println(n1.compareTo(n2));   // Output - 0 & positive & negative (Dif of two str)
        System.out.println(n1.concat(n2));      // add two string

        // Index of -->
        System.out.println(n1.indexOf('s'));
        System.out.println(n1.indexOf("ha"));
        System.out.println(n1.indexOf("bh" , 0, 6));


        String sentence = "Subham De";
        System.out.println(sentence.substring(0, 7));
        System.out.println(sentence.substring(7, sentence.length()));

        PW();
        equals();
    }
}
