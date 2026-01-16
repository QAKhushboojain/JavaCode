package ExceptionHandling;
// throw keyword
public class T18 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught Null Pointer Exception");
            throw e;
        }
        finally {
            System.out.println("Finally");
            // Explanation: Exception rethrown after being caught; finally runs; then uncaught exception terminates program.
        }
    }
}
