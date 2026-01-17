package ExceptionHandling;
// UncaughtExceptionHandler demonstration
public class T40 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> { throw new RuntimeException("tErr"); });
        t.setUncaughtExceptionHandler((th, ex) -> System.out.println("Handled " + ex.getMessage()));
    t.start();
    // Explanation: Custom handler receives uncaught exception from thread.
    }
}
