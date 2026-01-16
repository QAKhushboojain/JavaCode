package ExceptionHandling;

public class T12 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }
        finally {
            System.out.println("Finally Runs");
            // Explanation: finally executes, then the uncaught exception propagates and terminates the program.
        }
    }
}
