package ExceptionHandling;

// Suppressing checked exception by wrapping in unchecked

public class T38 {
    public static void main(String[] args) {
        try {
            throw new Exception("Checked");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
            // Explanation: Checked exception wrapped in runtime exception; stack shows cause.
        }
    }
}
