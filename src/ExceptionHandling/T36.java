package ExceptionHandling;
//  Using getCause() to chain exceptions
public class T36 {
    public static void main(String[] args) {
        RuntimeException r = new RuntimeException("Outer", new IllegalStateException("Cause"));
        System.out.println(r.getCause().getMessage());
        // Explanation: getCause() returns underlying exception that was chained.
    }
}