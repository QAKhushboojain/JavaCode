package Static_Non_Static_Behavior;

public class A4 {
    void n()
    {
        System.out.println("Instance");
    }

    public static void main(String[] args) {
        A4 a = null;
        a.n();
        // Exception in thread "main" java.lang.NullPointerException
        // Instance method called using null reference (NPE)
        // Explanation: calling instance method on null causes NPE at runtime.
    }
}
