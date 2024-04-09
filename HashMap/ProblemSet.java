import java.util.HashMap;
import java.util.Map;

public class ProblemSet {

    static void maxFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        System.out.println(map.entrySet());
        int mxFreq = 0, ansKey = -1;
        for (var e : map.entrySet()) {
            if (e.getValue() > mxFreq) {
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println("Element with maximum frequency is " + ansKey);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 1, 4, 1, 2, 5, 2, 2, 1, 2, 2 };
        maxFrequency(arr);
    }
}
