
public class StrBuilder {

    static void reverseString() {
        StringBuilder sb = new StringBuilder("Subham De");

        // just print not change original string
        for (int i = sb.length() - 1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
        System.out.println();
        
        // reverse original string
        // 1st Method -->
        sb.reverse();
        System.out.println(sb);

        // 2nd method -->
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Subham De");
        System.out.println(sb);
        
        // length of the StringBuilder -->
        System.out.println(sb.length());

        // char at index 4 -->
        System.out.println(sb.charAt(3));

        // set char -->
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert element at the last -->
        sb.append("y");
        System.out.println(sb);

        // insert char at any index
        sb.insert(1, 'S');
        System.out.println(sb);

        // delete the 1st character 'P'
        // sb.delete(1, 6);
        // System.out.println(sb);
        // sb.deleteCharAt(0);
        // System.out.println(sb);

        reverseString();

    }
}