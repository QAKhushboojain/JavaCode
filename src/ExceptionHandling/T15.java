package ExceptionHandling;

public class T15 {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
            throw new RuntimeException("R");
        }
        finally {
            System.out.println("Finally");
            // Explanation: finally runs, then the RuntimeException (uncaught) continues and terminates program.
        }
    }
}
