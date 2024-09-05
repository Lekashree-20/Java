package AbPacEx.ExceptionHandling.Fourth;

public class Main {
    

        // Method to register a user
        public void registerUser(String username, String userCountry) throws InvalidCountryException {
            // Check if the user's country is India
            if (!userCountry.equals("India")) {
                // Throw exception if the user is not located in India
                throw new InvalidCountryException("User Outside India cannot be registered");
            } else {
                // Print success message if the user is located in India
                System.out.println("User registration done successfully");
            }
        }
    
        public static void main(String[] args) {
            Main registration = new Main();
    
            // Test case 1: User located outside India
            try {
                registration.registerUser("Mickey", "US");
            } catch (InvalidCountryException e) {
                System.out.println(e.getMessage());
            }
    
            // Test case 2: User located in India
            try {
                registration.registerUser("Mini", "India");
            } catch (InvalidCountryException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

