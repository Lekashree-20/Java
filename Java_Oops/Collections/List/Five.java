package Collections.List;

import java.util.LinkedList;
import java.util.List;

public class Five {
    public static void main(String[] args) {
        // Create a LinkedList to hold the months of the year
        List<String> months = new LinkedList<>();

        // Add all months to the LinkedList
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print the months in the LinkedList
        System.out.println("Months of the year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}

