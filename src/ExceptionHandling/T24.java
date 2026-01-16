package ExceptionHandling;
// catch reassigning exception variable (effective final in lambda) — interview trick
public class T24 {
    public static void main(String[] args) {
        Exception ex = new Exception("E");
        try {
            throw ex;
        }
        catch (Exception e)
        {
            e = new Exception("E2"); // allowed for local variable
            // Explanation: Catch parameter is a local variable; can be reassigned. (But cannot reassign if it's used in inner lambda needing effectively final.)
        }
    }
}
