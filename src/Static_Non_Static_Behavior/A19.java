package Static_Non_Static_Behavior;
// static synchronized vs instance synchronized
public class A19 {
    static synchronized void s()
    {
        System.out.println("Static Synchronized");
    }
    synchronized void i()
    {
        System.out.println("instance Synchronized");
    }

    public static void main(String[] args) {
        A19.s();
        new A19().i();
        // Explanation: both work single-threaded; static sync locks class object, instance sync locks instance.
    }
}
