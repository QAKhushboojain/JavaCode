package ExceptionHandling;
// Exception chaining using initCause
public class T27 {
    public static void main(String[] args) {
        RuntimeException  r = new RuntimeException("Outer");
        r.initCause(new IllegalAccessException("Inner"));
        throw r;
        // Explanation: initCause attaches a cause to the thrown exception, showing chain.
    }
}
