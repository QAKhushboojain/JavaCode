package ExceptionHandling;
// Exception when accessing file without handling (checked)
import java.io.FileInputStream;
import java.io.IOException;

public class T30 {
    public static void main(String[] args) throws IOException {
        new FileInputStream("No File.txt");
        // FileNotFoundException is checked; declared thrown from main; JVM prints stack trace.
  // FileNotFoundException is a checked exception, so compiler forces handling.
    }
}
