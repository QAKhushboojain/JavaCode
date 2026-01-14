package Constructor;
// Constructor with synchronized block (behavioural)
public class Sync {
    Sync()
    {
        synchronized (this)
        {
            System.out.println("Inside");
        }
    }

    public static void main(String[] args) {
        new Sync();
        // Explanation: Synchronized code inside constructor executed; same as normal method.
    }
}
