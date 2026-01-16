package ExceptionHandling;

public class T11 {
    public static void main(String[] args) {
        try {
            int a = 1/10;
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer Exception");
            // Explanation: Catch block doesn't match ArithmeticException so exception propagates and program crashes.
        }
    }
}
