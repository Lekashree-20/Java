package AbPacEx.ExceptionHandling.Fifth;

// Custom exception class for handling invalid age
class InvalidAgeException extends Exception {
    // Constructor that accepts a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom exception class for handling invalid names
class InvalidNameException extends Exception {
    // Constructor that accepts a custom error message
    public InvalidNameException(String message) {
        super(message);
    }
}

public class Main {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age >= 60) {
            throw new InvalidAgeException("Invalid age: Age must be >= 18 and < 60.");
        }
    }

    // Method to validate name
    public static void validateName(String name) throws InvalidNameException {
        // Regular expression to ensure the name contains only letters and spaces
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new InvalidNameException("Invalid name: Name must contain only letters and spaces.");
        }
    }

    public static void main(String[] args) {
        try {
            // Ensure exactly two arguments are provided
            if (args.length != 2) {
                throw new IllegalArgumentException("Two arguments required: <name> <age>");
            }

            // Retrieve name and age from command-line arguments
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            // Validate name
            validateName(name);

            // Validate age
            validateAge(age);

            // Display the input if valid
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid integer.");
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
