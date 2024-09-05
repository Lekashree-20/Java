package AbPacEx.ExceptionHandling.Third3;

// Exception for handling negative marks
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Exception for handling marks out of range (0-100)
class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}
