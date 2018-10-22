public class UnsupportedOperationException extends Exception {
    
    //Default constructor
    public UnsupportedOperationException() {
        super("Error: You are using an unsupported method.");
    }

    //Parameterized constructor
    public UnsupportedOperationException(String message) {
        super(message);
    }

    public String toString() {
        return "Error: You are using an unsupported method.";
    }
}