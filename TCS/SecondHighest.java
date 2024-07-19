
public class SecondHighest {
    
    public static int highest(int[] arr){
        int n = arr.length;
        int large =Integer.MIN_VALUE;
        int secondLarge =Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }

        for(int i=0 ; i<n ; i++){
            if(arr[i] != large && arr[i] > secondLarge){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static int lowest(int[] arr){
        int n = arr.length;
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i=0 ; i<n ; i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i] != small && arr[i] < secondSmall){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    // public static int 

    public static void main(String[] args) {
        int[] arr = {10, 3, 7, 5, 1, 8, 2, 4, 9};

        System.out.println(highest(arr));
        System.out.println(lowest(arr));
    }
}


