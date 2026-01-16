package ExceptionHandling;

public class T6 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("r");
        }
        catch (Exception e)
        {
            System.out.println("Caught Exception");
        }
       // catch (RuntimeException r)
        {
            System.out.println("Caught Runtime");
         //   Compile-time result
        //    Compilation error: unreachable catch block
        //    Explanation: RuntimeException is subclass of Exception. Specific (RuntimeException) must come before general (Exception); otherwise unreachable catch causes compile error.
// RuntimeException is a child of Exception.

//But Java checks catch blocks top to bottom.
        }
    }
}
