package javaCollectionFramework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Implementation {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Grapes");
        map.put(5, "Date");
        map.put(2, "Blueberry"); // Updates key 2's value

        // Printing the HashMap
        System.out.println("Initial HashMap: " + map);

        // Retrieving a value using a key
        System.out.println("Value for key 3: " + map.get(3));

        // Checking if a key exists
        System.out.println("Contains key 4? " + map.containsKey(4));

        // Checking if a value exists
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // Removing an element from the HashMap
        map.remove(5);
        System.out.println("After removing key 5: " + map);

        // Iterating over keys and values using forEach
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Checking the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Clearing all elements from the HashMap
        map.clear();
        System.out.println("HashMap after clear: " + map);
    }
}
