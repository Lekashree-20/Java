package AbPacEx.ExceptionHandling.Fourth;

// Custom exception class for invalid country registration
class InvalidCountryException extends Exception {
    // Default constructor
    // public InvalidCountryException() {
    //     super();
    // }

    // Constructor that accepts a custom message
    public InvalidCountryException(String message) {
        super(message);
    }
}
