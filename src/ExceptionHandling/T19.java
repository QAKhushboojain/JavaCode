package ExceptionHandling;

public class T19 {
    public static void main(String[] args) {
        try {
            int a [] = null;
            System.out.println(a.length);
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Either Null Pointer Exception or Array Index Out of Bound Exception");
            // Explanation: Multi-catch handles both types (no separate handling).
        }
    }
}
