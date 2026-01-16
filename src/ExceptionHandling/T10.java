package ExceptionHandling;

public class T10 {
    public static void main(String[] args) {
        try {
            System.exit(0);
        }
        finally {
            System.out.println("CleanUp");
            // System.exit() is the only common case where finally does NOT execute.
            // Explanation: System.exit prevents finally from executing; JVM terminates immediately.
        }
    }
}
