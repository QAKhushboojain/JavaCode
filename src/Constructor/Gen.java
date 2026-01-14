package Constructor;
// Constructor with generics (type erasure does not affect ctor)
public class Gen<T> {
    Gen()
    {
        System.out.println("Gen");
    }

    public static void main(String[] args) {
        new Gen<String>();
        // Explanation: Generics are compile-time only; constructor runs normally.
    }
}
