package Static_Non_Static_Behavior;
// Calling private static method from same class
public class A17 {
    private static void m()
    {
        System.out.println("Private static");
    }

    public static void main(String[] args) {
        m();
        // Explanation: private static accessible inside same class.
    }
}
