package Wrapper;
import java.util.Scanner;
public class Three {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer between 1 and 255: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number < 1 || number > 255) {
            System.out.println("Error: Number must be between 1 and 255.");
            return;
        }

        // Convert the number to binary and format it as an 8-digit string
        String binaryString = Integer.toBinaryString(number);
        String paddedBinaryString = String.format("%8s", binaryString).replace(' ', '0');

        // Print the 8-digit binary representation
        System.out.println("Binary representation: " + paddedBinaryString);
        scanner.close();
    }
}


