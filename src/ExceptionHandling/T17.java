package ExceptionHandling;
//  try-with-resources basic
import java.io.*;
public class T17 {
    public static void main(String[] args) {
        try (ByteArrayInputStream b = new ByteArrayInputStream(new byte[0]))
        {
            System.out.println("In Try");
        }
        catch(Exception e)
        {
            System.out.println("Catch");
            // Explanation: Resource auto-closed; no exceptions.
        }
    }
}
