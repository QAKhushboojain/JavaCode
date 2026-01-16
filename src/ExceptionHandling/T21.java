package ExceptionHandling;
// Checked vs unchecked: forgetting to declare checked
public class T21 {
    public static void main(String[] args) {
    //    throw new Exception();
        // Compile-time result
        //Compilation error: unreported exception Exception; must be caught or declared to be thrown
        // Explanation: Checked exceptions must be declared or caught.

    }
}
