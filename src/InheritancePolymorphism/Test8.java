package InheritancePolymorphism;

public class Test8 {
    public static void main(String[] args) {
        Parent8 p = new Child8();
        p.sm();
        p.im();
        // Explanation: Static methods are hidden, resolved by reference type; instance methods are overridden and resolved at runtime.
    }
}
