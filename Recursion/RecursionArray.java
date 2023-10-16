import java.util.*;

public class RecursionArray {

    static void printArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx+1);
    }

    static int findMax(int[] arr, int idx){
        // Base Case
        if(idx == arr.length-1){
            return arr[idx];
        }
        // small problem
        int ans = findMax(arr, idx+1);
        return Math.max(arr[idx], ans);
    }

    static int totalSum(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        return arr[idx] + totalSum(arr, idx+1);
    }

    static boolean findElement(int[] arr, int idx, int target){
        if(idx >= arr.length){
            return false;
        }
        if(arr[idx] == target){
            return true;
        }
        return findElement(arr, idx+1, target);
    }       // Time Complexity - O(n)

    static int findTargetElement(int[] arr, int idx, int target){
        if(idx >= arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx+1;
        }
        return findTargetElement(arr, idx+1, target);
    }

    static void elementIndex(int[] arr, int idx, int target){
        if(idx >= arr.length){
            return;
        }
        if(arr[idx] == target){
            System.out.print((idx+1) + " ");
        }
        elementIndex(arr, idx+1, target);
    }

    static ArrayList<Integer> allIndex(int[] arr, int idx, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx >= arr.length){
            return ans; // Return empty arrayList
        }

        if(arr[idx] == target){
            ans.add(idx);
        }

        ArrayList<Integer> smallAns = allIndex(arr, idx+1, target);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        int[] arr = {3, 4, 5, 6, 4 ,8, 4};

        printArray(arr, 0);
        System.out.println();

        System.out.println(findMax(arr, 0));

        System.out.println(totalSum(arr, 0));

        if(findElement(arr, 0, 5)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        System.out.println(findTargetElement(arr, 0, 5));

        elementIndex(arr, 0, 4);
        System.out.println();

        int[] arr2 = {3, 3, 4, 3};
        ArrayList<Integer> ans = allIndex(arr2, 0, 3);
        for(Integer i : ans){
            System.out.print((i+1) + " ");
        }
    }
}
