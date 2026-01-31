package Static_Non_Static_Behavior;
// Calling static method normally
public class A {
    static void m()
    {
        System.out.println("Static M");
    }

    public static void main(String[] args) {
        A.m();
        // Explanation: direct call to static method via class name.
    }
}
