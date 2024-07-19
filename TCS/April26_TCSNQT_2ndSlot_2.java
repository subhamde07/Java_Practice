// [Item, quantity, price]

// Input - 3
//         ["Apple" 1.0 5]      (1*5 = 5)
//         ["orange" 10.0 5]    (10*5=50)
//         ["apple" 10.0 5]     (10*5=50)

// total seeling = apple - 55, orange - 50

// 1. Higher selling item - Apple [55]
// 2. Total seeling price - 105.00 [(5*1) + (10*5) + (10*5)]
// 3. Avg. seeling price  - 35.00   [(50+55)/3]

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class April26_TCSNQT_2ndSlot_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Input -->
        HashMap<String, Float> map = new HashMap<>();
        float totalPrice = 0;
        for(int i=1 ; i<=n ; i++) {
            String item = sc.next();
            float quantity = sc.nextFloat();
            float price = sc.nextFloat();
            
            float sellingPrice = quantity * price;
            if(!map.containsKey(item)){
                map.put(item, quantity * price);
            } else{
                map.put(item, map.get(item) + sellingPrice);
            }
            totalPrice += sellingPrice;
        }

        // Output -->
        float maxPrice = (Collections.max(map.values()));
        for(var i : map.entrySet()){
            if(i.getValue() == maxPrice){
                System.out.println("Higher selling item - " + i.getKey());
            }
        }
        System.out.println("Total Selling Price - " + totalPrice);
        System.out.println("Avg. Selling Price - " + totalPrice/n);
    }
}
