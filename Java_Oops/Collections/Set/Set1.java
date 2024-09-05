package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        Set<String> Set1 = new HashSet<>();

        // Add employee names to the HashSet
        Set1.add("John Doe");
        Set1.add("Jane Smith");
        Set1.add("Robert Brown");
        Set1.add("Emily Davis");
        Set1.add("Michael Johnson");

        // Create an Iterator to retrieve elements from the HashSet
        Iterator<String> iterator = Set1.iterator();

        // Print the employee names using the Iterator
        System.out.println("Employee names:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
