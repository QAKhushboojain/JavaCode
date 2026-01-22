package InheritancePolymorphism;

public class Test16 {
    public static void main(String[] args) {
        Parent13 p = new Child13();
        if (p instanceof Child13) ((Child13)p).m();
// Explanation: instanceof check prevents ClassCastException.
    }
}
