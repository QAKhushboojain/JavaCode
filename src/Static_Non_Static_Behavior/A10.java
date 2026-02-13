package Static_Non_Static_Behavior;

public class A10 {
    static {
        System.out.println("Static");
    }
    A10()
    {
        System.out.println("CTOR");
    }

    public static void main(String[] args) {
        new A10();
        new A10();
        // Explanation: static runs once when class is loaded.
        // Static block executed once even if multiple objects
    }
}
