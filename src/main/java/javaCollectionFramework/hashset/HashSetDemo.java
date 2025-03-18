package javaCollectionFramework.hashset;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo { // Renamed class
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(5);
        set.add(3); // Duplicate not added

        set.remove(3);

        System.out.println("Contains 2? " + set.contains(2));
        System.out.println("Contains 3? " + set.contains(3));

        System.out.println("Elements in HashSet:");
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Size of HashSet: " + set.size());
    }
}
