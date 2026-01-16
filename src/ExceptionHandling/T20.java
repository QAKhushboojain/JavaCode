package ExceptionHandling;
// Order of finally vs catch when no exception
public class T20 {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        }
        catch (Exception e)
        {
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Done");
        // Explanation: Normal flow: try → finally → after try-catch.
    }
}
