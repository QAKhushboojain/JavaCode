package ExceptionHandling;

public class T4 {
    public static void main(String[] args) {
        try {
            int a = 5/0;  // ArithmeticException: / by zero
            // As soon as exception occurs:

            //Remaining lines inside try are skipped.

            //So this line is NOT executed:
            System.out.println("Inside Try");
        }
        catch (ArithmeticException e)
        {
          //  JVM looks for a matching catch.

         //   ArithmeticException matches ✔

        //    Control enters this catch block.
            System.out.println("Caught");
        }
        // After handling the exception, program continues normally.

        //This line always executes (unless program exits or another exception occurs)
        System.out.println("After try-catch");
// Explanation: Exception caught; code after catch continues.
    }
}
