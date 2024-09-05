package Collections.List.Seventh;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        // Create a Vector to store Seven objects
        Vector<Seven> SevenVector = new Vector<>();

        // Add Seven objects to the Vector
        SevenVector.add(new Seven(1, "John Doe", "john.doe@example.com"));
        SevenVector.add(new Seven(2, "Jane Smith", "jane.smith@example.com"));
        SevenVector.add(new Seven(3, "Alice Johnson", "alice.johnson@example.com"));
        SevenVector.add(new Seven(4, "Bob Brown", "bob.brown@example.com"));

        // List all elements using Iterator
        System.out.println("Listing Sevens using Iterator:");
        Iterator<Seven> iterator = SevenVector.iterator();
        while (iterator.hasNext()) {
            Seven Seven = iterator.next();
            System.out.println(Seven);
        }

        // List all elements using Enumeration
        System.out.println("\nListing Sevens using Enumeration:");
        Enumeration<Seven> enumeration = SevenVector.elements();
        while (enumeration.hasMoreElements()) {
            Seven Seven = enumeration.nextElement();
            System.out.println(Seven);
        }
    }
}
