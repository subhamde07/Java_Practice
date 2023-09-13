// import java.io.*;
import java.util.*;

public class Program1{
    public static void main(String[] args) {
        
        Map<String, Integer> mp = new HashMap<>();

        //Adding Elements
        mp.put("Subham", 23);
        mp.put("rahul", 16);
        mp.put("hari", 25);

        //Getting value
        System.out.println(mp.get("Subham"));   //Output - 23
        System.out.println(mp.get("Amit"));     //Output - None

        //Updating value of key
        mp.put("Subham", 21); // key is unique but values are replicate
        System.out.println(mp.get("Subham"));   //Output - 21

        //Remove pair from Hashmap
        System.out.println(mp.remove("rahul"));     //Output - 16 (Value)
        System.out.println(mp.remove("rahul", 16)); //Output - True (Boolean)

        //Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Subham"));   //Output - True (Check by key)
        System.out.println(mp.containsValue(21));       //Output - True (Check by Value)
        System.out.println(mp.containsKey("rahul"));    //Output - False

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("chandan", 28);

        //get all key in the hashmap
        System.out.println(mp.keySet());        //Output - all Kay

        //Get all value in the map
        System.out.println(mp.values());        //Output - All value

        //Get all entries in the map
        System.out.println(mp.entrySet());      //Output - All Entries
        
    }
}