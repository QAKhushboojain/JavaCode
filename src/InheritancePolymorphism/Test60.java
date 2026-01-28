package InheritancePolymorphism;

public class Test60 {
    public static void main(String[] args) {
        P6 p = new C15();
        System.out.println(p);
        // Explanation: toString() overridden; println calls runtime type method.
    }
}

