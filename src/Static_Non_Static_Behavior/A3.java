package Static_Non_Static_Behavior;

public class A3 {
    static void m()
    {
        System.out.println("Static");
    }

    public static void main(String[] args) {
        A3 a = null;
        a.m();
        // Explanation: compile-time allowed; static call resolved at compile-time to class; no NPE.
        // Static method called using null reference (allowed)
    }
}
