package ExceptionHandling;

public class T16 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("First");
        }
        finally {
            throw new RuntimeException("Second");
            // Explanation: Exception thrown in finally suppresses the original; original becomes suppressed cause (depending on JVM stack trace, second is main).
        }
    }
}
