public class PerfectSquare {
    public static void main(String[] args) {
        int n = 4;

        boolean flag = false;

        for(int i=1 ; i*i <=n ; i++){
            if(i*i == n){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Perfect Square");
        } else{
            System.out.println("Not a perfect square");
        }
    }
}
