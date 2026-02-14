package Static_Non_Static_Behavior;
// Static state shared across objects
public class A15 {
    static int s = 0;
    void inc()
    {
        s++;
        System.out.println(s);
    }

    public static void main(String[] args) {
        A15  a1 = new A15();
        A15 a2 = new A15();
        a1.inc();
        a2.inc();
        // Explanation: static variable shared across instances.
    }
}
