package Constructor;
// Constructor and unreachable code by throwing in constructor
public class ThrowInConstructor {
    ThrowInConstructor()
    {
        throw new RuntimeException("OOPS");
    }

    public static void main(String[] args) {
        try
        {
            ThrowInConstructor t = new ThrowInConstructor();
            System.out.println("After");
        }
        catch (RuntimeException e)
        {
            System.out.println("Caught");
            // Explanation: Exception thrown prevents printing "after"; caught in catch block.
        }
    }
}
