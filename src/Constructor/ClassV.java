package Constructor;
// Overloaded constructors with this(...) chain and parameters
public class ClassV {
    ClassV() {
        this(1); // calls parameterized constructor
        System.out.println("V()");
    }

    ClassV(int x) {
        System.out.println("V(int)");
    }

    public static void main(String[] args) {
        new ClassV();
        // Output:
        // V(int)
        // V()
        // Explanation: this(1) runs parameterized ctor first, then rest of no-arg.
    }
}
