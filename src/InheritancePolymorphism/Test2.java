package InheritancePolymorphism;

public class Test2 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.show();
        // Explanation: Overridden method resolved at runtime (dynamic dispatch).
        // Parent has → show() → prints "Parent"
        //
        //Child has → show() → prints "Child"
        // This is called upcasting.
        //
        //Part	Meaning
        //Parent p	Reference type is Parent
        //new Child()	Object is Child
        // Compiler checks methods using reference type (Parent)
        //
        //JVM runs method using object type (Child)
        // Overridden method is called based on OBJECT, not reference.
        //
        //Even though reference is Parent, method runs from Child.
        // Runtime polymorphism works only for:
        //
        //✅ Instance methods
        //
        //❌ Not for static methods
        //
        //❌ Not for variabless
    }
}
