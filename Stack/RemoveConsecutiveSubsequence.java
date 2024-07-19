import java.util.Stack;

public class RemoveConsecutiveSubsequence {
    
    static int[] removeSubArray(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<arr.length ; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else{
                if(st.peek() != arr[i]){
                    st.push(arr[i]);
                }else{
                    if(arr[i] == arr[i+1]){
                        continue;
                    }else{
                        st.pop();
                    }
                }
            }
        }
        int[] ans = new int[st.size()];
        for(int i=st.size()-1 ; i>=0 ; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 7, 7, 2};
        int[] ans = removeSubArray(arr);
        for(int i : ans){
            System.out.print(i + " ");  // 1 3 5 2
        }
    }
}
