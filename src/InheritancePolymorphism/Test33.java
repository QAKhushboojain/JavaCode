package InheritancePolymorphism;

public class Test33 {
    public static void main(String[] args) {
        Object o = new B4();
        ((A4)o).m();
// Explanation: Cast to A then call m(); runtime dispatch uses actual B.
    }
}
