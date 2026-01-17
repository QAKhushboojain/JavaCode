package ExceptionHandling;
// InterruptedException handling with Thread.sleep
public class T34 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1);
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Done");
        // Explanation: sleep rarely interrupted; InterruptedException checked and must be handled or declared. If not interrupted, only "Done" prints.
    }
}
