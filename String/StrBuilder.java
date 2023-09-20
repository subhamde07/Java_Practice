public class StrBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Subham De");
        System.out.println(sb);

        // char at index 4 -->
        System.out.println(sb.charAt(3));

        //set char -->
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char at any index
        sb.insert(1, 'S');
        System.out.println(sb);

        // delete the 1st character 'P'
        sb.delete(0, 1);
        System.out.println(sb);

        //indert element at the last -->
        sb.append("y");
        System.out.println(sb);

        //length of the StringBuilder -->
        System.out.println(sb.length());

        //Reverse the StringBuilder -->
        //1st Method -->
        for(int i=sb.length()-1; i>=0; i--){
            System.out.print(sb.charAt(i));
        }
        System.out.println();
        // 2nd method -->
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}