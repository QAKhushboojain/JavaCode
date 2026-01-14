package Constructor;
// Constructor invocation order for derived object with static initializers in both classes
public class X {
    static
    {
        System.out.println("X static");
    }
    X()
    {
        System.out.println("X Constructor");
    }
}
