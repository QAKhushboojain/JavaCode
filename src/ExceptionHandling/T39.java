package ExceptionHandling;
// Exception in main thread vs other thread (uncaught handler)
public class T39 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> { throw new RuntimeException("tErr"); });
        t.start();
        System.out.println("Main Done");
// Explanation: Exception in child thread doesn't crash main; JVM prints stack trace for that thread.
    }
}
