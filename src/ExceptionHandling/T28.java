package ExceptionHandling;
// Exception in finally suppresses earlier thrown exception — demonstrating suppressed and cause
public class T28 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("First");
        }
        finally {
            throw new RuntimeException("Second");
            // Explanation: second (finally) becomes the main thrown exception; first becomes cause/suppressed (JVM prints cause).
        }
    }
}
