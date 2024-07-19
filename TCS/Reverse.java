public class Reverse {

    static void reverseString(String str){
        String newStr = "";
        for(int i=0 ; i<str.length() ; i++){
            char temp = str.charAt(i);
            newStr = temp + newStr;
        }
        System.out.println("Reverse of the string is: " + newStr);

        // Second Method -->
        StringBuilder newStr2 = new StringBuilder(str);
        newStr2.reverse();
        System.out.println("Reverse of the string is: " + newStr2);
    }

    static void reverseInt(int num){
        int newNum = 0;

        while(num != 0){
            int temp = num % 10;
            newNum = newNum * 10 + temp;
            num = num / 10;
        }
        System.out.println("Reverse of the number is: " + newNum);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int num = 2015;

        reverseString(str);
        reverseInt(num);
    }
}
