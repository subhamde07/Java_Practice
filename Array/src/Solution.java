// import java.util.*;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		  //  int[] arr = new int[3];
		    if(n>=4){
		        int check = n/3;
				int oddFine = check + (n%3);
		        System.out.println(check + " " + check + " " + oddFine);
		    }
		}
	}
}