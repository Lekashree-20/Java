package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1{
    public static void main(String[] args) {
        // Create a HashMap to store contacts
        Map<String, Integer> contacts = new HashMap<>();

        // Add some contacts to the HashMap
        contacts.put("John Doe", 123456789);
        contacts.put("Jane Smith", 987654321);
        contacts.put("Robert Brown", 555666777);
        contacts.put("Emily Davis", 444555666);

        // Check if a particular key exists
        String nameToCheck = "Jane Smith";
        if (contacts.containsKey(nameToCheck)) {
            System.out.println(nameToCheck + " is in the contact list.");
        } else {
            System.out.println(nameToCheck + " is not in the contact list.");
        }

        // Check if a particular value exists
        int numberToCheck = 555666777;
        if (contacts.containsValue(numberToCheck)) {
            System.out.println("The phone number " + numberToCheck + " is in the contact list.");
        } else {
            System.out.println("The phone number " + numberToCheck + " is not in the contact list.");
        }

        // Use Iterator to loop through the map
        System.out.println("\nContact List:");
        Set<Map.Entry<String, Integer>> entrySet = contacts.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }
}

