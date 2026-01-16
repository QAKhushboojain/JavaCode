package ExceptionHandling;

public class T7 {
    public static void main(String[] args) {
        try {
            int a [] = new int[-1];
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Negative Size");
            // Explanation: Creating array with negative size throws NegativeArraySizeException (unchecked), caught by matching catch.
        }
    }
}
