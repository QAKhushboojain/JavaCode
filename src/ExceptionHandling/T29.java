package ExceptionHandling;
// NullPointerException in catch block
public class T29 {
    public static void main(String[] args) {
        try {
            String  s = null;
            s.length();
        }
        catch (Exception e)
        {
            System.out.println("In Catch");
            String t = null;
            System.out.println(t.length()); // / NPE in catch
            // Explanation: First exception caught; new exception thrown in catch; if uncaught, it terminates program.
        }
    }

}
