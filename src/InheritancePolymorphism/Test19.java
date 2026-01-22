package InheritancePolymorphism;

public class Test19 {
    public static void main(String[] args) throws Exception {
        Parent16 p = new Child16();
        p.m();
        // Explanation: Child's override throws no checked exception — allowed.
    }
}
