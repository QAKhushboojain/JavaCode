package ExceptionHandling;

public class T10 {
    public static void main(String[] args) {
        try {
            System.exit(0);
        }
        finally {
            System.out.println("CleanUp");
            // Explanation: System.exit prevents finally from executing; JVM terminates immediately.
        }
    }
}
