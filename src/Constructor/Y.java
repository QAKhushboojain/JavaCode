package Constructor;
// Constructor invocation order for derived object with static initializers in both classes
public class Y extends X{
    static
    {
        System.out.println("Y static");
    }
    Y()
    {
        System.out.println("Y Constructor");
    }

    public static void main(String[] args) {
        new Y();
        // Explanation: Parent static init loads before child static; then parent ctor runs first for object construction.
    }
}
