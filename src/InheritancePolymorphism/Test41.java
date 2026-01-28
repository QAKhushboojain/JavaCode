package InheritancePolymorphism;

public class Test41 {
    public static void main(String[] args) {
        new C5().d();
        // Explanation: Class calls its own implementation then interface default via I.super.d().
    }
}
