package Wrapper;

public class Two {
    
        public static void main(String[] args) {
            // Check if exactly one argument is provided
            if (args.length != 1) {
                System.out.println("Usage: java NumberConverter <integer>");
                return;
            }
    
            try {
                // Parse the command line argument as an integer
                int number = Integer.parseInt(args[0]);
    
                // Convert the integer to binary, octal, and hexadecimal
                String binaryString = Integer.toBinaryString(number);
                String octalString = Integer.toOctalString(number);
                String hexString = Integer.toHexString(number).toUpperCase();
    
                // Print the results
                System.out.println("Binary equivalent: " + binaryString);
                System.out.println("Octal equivalent: " + octalString);
                System.out.println("Hexadecimal equivalent: " + hexString);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer.");
            }
        }
    }
    

