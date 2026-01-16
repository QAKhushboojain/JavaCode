package ExceptionHandling;
// RuntimeException subclass vs Exception behavior
public class T23 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }
        catch (Exception e)
        {
            System.out.println("Exception caught");
            // Explanation: Unchecked IllegalArgumentException caught by Exception catch.
        }
    }
}
