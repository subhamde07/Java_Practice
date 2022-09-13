import java.util.*;
public class PaidAmount {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Items price and total price
        double total = 0,discount = 0;
        System.out.print("Enter the number of items: \n");
        int n = input.nextInt();
        System.out.println("Enter the price of each items :");
        for (int i = 0; i < n; i++){
            System.out.print("Item No "+(i+1)+ ": ");
            int temp = input.nextInt();
            total = total + temp;
        }
        System.out.println("Total Amount = " + total);

        //Discount
        if(total >= 50000){
            System.out.println("Congratulation!!. You got 15% discount.");
            discount = (15*total)/100;
            System.out.println("Your Discount = "+ discount);
        }else if(total<50000 && total>=25000){
            System.out.println("Congratulation!!. You got 10% discount.");
            discount = (10*total)/100;
            System.out.println("Your Discount = "+ discount);
        }else if(total<25000 && total>=10000){
            System.out.println("Congratulation!!. You got 5% discount.");
            discount = (5*total)/100;
            System.out.println("Your Discount = "+ discount);
        }else if(total<10000 && total>=5000){
            System.out.println("Congratulation!!. You got 2% discount.");
            discount = (2*total)/100;
            System.out.println("Your Discount = "+ discount);
        }else{
            discount = 0;
            System.out.println("Sorry, No Discount");
            System.out.println("Your Discount = "+ discount);
        }
        total = total-discount;
        System.out.println("Amount to be paid = "+ total);
    }
}
