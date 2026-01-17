package ExceptionHandling;
// StackOverflowError from recursion
public class T31 {
    static void r()
    {
        r();
    }

    public static void main(String[] args) {
        r();
        // Explanation: Unbounded recursion exhausts stack causing StackOverflowError (Error, not Exception).
    }
}
