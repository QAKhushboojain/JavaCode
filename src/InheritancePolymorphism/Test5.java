package InheritancePolymorphism;

public class Test5 {
    public static void main(String[] args) {
        Parent5 p = new Child5();
        p.call();
        // Explanation: Private methods are not visible to subclasses — call() calls Parent's private secret().
    }
}
