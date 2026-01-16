package ExceptionHandling;

public class T9 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("12a");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format");
            // Explanation: Non-digit char causes NumberFormatException.
        }
    }
}
