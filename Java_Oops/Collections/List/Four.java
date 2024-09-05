package Collections.List;


import java.util.ArrayList;
import java.util.List;

public class Four {
    private List<Number> numberList;

    // Constructor to initialize the ArrayList
    public Four() {
        numberList = new ArrayList<>();
    }

    // Method to add a number to the ArrayList
    public void addNumber(Number number) {
        numberList.add(number);
    }

    // Method to print all elements in the ArrayList
    public void printAll() {
        System.out.println("Numbers in the ArrayList:");
        for (Number number : numberList) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // Create an instance of Four
        Four numericList = new Four();

        // Add different numeric types
        numericList.addNumber(10);       // Integer
        numericList.addNumber(15.5f);    // Float
        numericList.addNumber(20.99);    // Double

        // Print all elements
        numericList.printAll();
    }
}


