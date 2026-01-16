package ExceptionHandling;

public class T14 {
    public static void m() throws Exception
    {
    throw  new Exception("Error");
    }

    public static void main(String[] args) {
        try {
            m();
        }
        catch (Exception e)
        {
            System.out.println("Handled");
            // Explanation: m() throws checked exception; caller catches it.
        }
    }
}
