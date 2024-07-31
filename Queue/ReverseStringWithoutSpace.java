
public class ReverseStringWithoutSpace {

    static String reverseString(String s){
        int i = 0, j = s.length()-1;
        char[] ans = s.toCharArray();
        while(i<j){
            char sf = s.charAt(i);
            char se = s.charAt(j);
            if(sf != ' ' && se != ' '){
                char temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
                i++;j--;
            } else if(sf == ' '){
                i++;
            } else if(se == ' '){
                j--;
            }
            
        }
        return new String(ans);
    }

    public static void main(String[] args) {

        String str = "my name is subham de";
        System.out.println(str);
        System.out.println(reverseString(str));
    }
}
