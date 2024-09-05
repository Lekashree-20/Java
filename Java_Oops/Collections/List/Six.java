package Collections.List;

import java.util.Vector;

public class Six {
    public static void main(String[] args) {
        // Create a Vector to store the months of the year
        Vector<String> months = new Vector<>();

        // Add all the months to the Vector
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

        // Print all the months
        System.out.println("Months of the Year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}
