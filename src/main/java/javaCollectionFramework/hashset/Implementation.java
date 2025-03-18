package javaCollectionFramework.hashset;

import java.util.HashSet;

public class Implementation {
    public static void main(String[] args) {
        // Creating a HashSet of Integer type
        HashSet<Integer> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(5);
        set.add(3); // Duplicate not added (HashSet doesn't allow duplicates)

        // Removing an element from the HashSet
        set.remove(3);

        System.out.println(set.contains(2));

        // Printing the HashSet (unordered)
        System.out.println(set);

        // Printing the size of the HashSet
        System.out.println(set.size());
    }
}
