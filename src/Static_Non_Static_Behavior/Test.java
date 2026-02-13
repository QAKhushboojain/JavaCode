package Static_Non_Static_Behavior;

import InheritancePolymorphism.C;

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.s();
        // Explanation: static methods are hidden not overridden; compile-time binding uses reference type.
        // Static method hiding vs overriding
    }
}
