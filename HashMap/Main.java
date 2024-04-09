
// import java.io.*;
import java.util.*;

public class Main {

    static void HashMapMethods() {
        Map<String, Integer> mp = new HashMap<>();

        // Adding Elements
        mp.put("Subham", 23);
        mp.put("rahul", 16);
        mp.put("hari", 25);

        // Getting value
        System.out.println(mp.get("Subham")); // Output - 23
        System.out.println(mp.get("Amit")); // Output - None

        // Updating value of key
        mp.put("Subham", 21); // key is unique but values are replicate
        System.out.println(mp.get("Subham")); // Output - 21

        // Remove pair from Hashmap
        System.out.println(mp.remove("rahul")); // Output - 16 (Value)
        System.out.println(mp.remove("Luv")); // Output - Null (Not present in map)
        System.out.println(mp.remove("rahul", 16)); // Output - True (Boolean)

        // Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Subham")); // Output - True (Check by key)
        System.out.println(mp.containsValue(21)); // Output - True (Check by Value)
        System.out.println(mp.containsKey("rahul")); // Output - False

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("chandan", 28);
        mp.putIfAbsent("rahul", 50);

        // get all key in the hashmap
        System.out.println(mp.keySet()); // Output - all Kay

        // Get all value in the map
        System.out.println(mp.values()); // Output - All value

        // Get all entries in the map
        System.out.println(mp.entrySet()); // Output - All Entries
    }

    static void HashMapTraverse() {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Subham", 23);
        mp.put("Rahul", 16);
        mp.put("Luv", 25);
        mp.put("Kali", 45);

        // First Method -> Using ForEach Loop
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s = %d\n", key, mp.get(key));
        }

        // Second Method -> Using EntrySet()
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s = %d\n", e.getKey(), e.getValue());
        }

        for(var e : mp.entrySet()){
            System.out.printf("Age of %s = %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {

        // Basic Methods
        // HashMapMethods();

        // Traversing all entries of HashMap -- Multiple Method
        HashMapTraverse();
    }
}