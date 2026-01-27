package InheritancePolymorphism;

public class Test37 {
    public static void main(String[] args) {
        H h = new I();
        h.sm(); // static
        h.im(); // Instance
        // Explanation: p.sm() calls P.sm() due to static binding; p.im() calls overridden instance method.
    }
}