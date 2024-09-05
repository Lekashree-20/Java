package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Three{
    
    private List<String> stringList;

    // Constructor to initialize the ArrayList
    public Three() {
        stringList = new ArrayList<>();
    }

    // Method to add a string to the ArrayList
    public void addString(String str) {
        stringList.add(str);
    }

    // Method to print all elements using an Iterator
    public void printAll() {
        Iterator<String> iterator = stringList.iterator();
        System.out.println("Elements in the ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        // Create an instance of StringArrayList
        Three myList = new Three();

        // Add some strings to the ArrayList
        myList.addString("Apple");
        myList.addString("Banana");
        myList.addString("Cherry");
        myList.addString("Date");
        myList.addString("Elderberry");

        // Print all elements
        myList.printAll();
    }
}
