import java.util.ArrayList;
import java.util.HashMap;

public class Temp {
    public static void main(String[] args) {

        String t = "ssdaptas";
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        int tl = t.length();
        for(int i=0 ; i<tl ; i++){
            if(map.containsKey(t.charAt(i))){
                map.get(t.charAt(i)).add(i);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(t.charAt(i), list);
            }
        }

        System.out.println(map);
    }
}
