import java.util.*;
public class PrimeNumber{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
//	  System.out.println("Enter First Number");
//	  int n = input.nextInt();
//    	  System.out.println("Enter last Number :");
//	  int m = input.nextInt();
//	  for(int i = n; i<=m ; i++){
//	  }
	  
	  
	  int ct = 0,n=0,i=1,j=1;
	  while(n<10){
	  	j=1;
	  	ct=0;
	  	while(j<=i){
	  		if(i%j==0){
	  			ct++;
	  			j++;
	  		}
	  		if(ct==2){
	  			System.out.println(i);
	  			n++;
	  		}
	  		i++;
	  	}
	  }
    
	
  }
}	
