package InheritancePolymorphism;

public class Test4 {
    public static void main(String[] args) {
        Parent4 p = new Child4();
        p.m("abc");
        // Explanation: Overloading is chosen at compile-time using reference type Parent: m(Object) exists; m(String) in Child is not overriding m(Object).
        // 1. Overloading vs Overriding
        //🔹 Overloading
        //
        //Same method name
        //
        //Different parameter types
        //
        //Decided at compile time
        //
        //👉 m(Object) and m(String) are overloaded, NOT overridden.
       // Because parameter types are different:

       // Parent → m(Object)

       // Child → m(String)

       // So Child did not override Parent’s method.
        //Reference Type vs Object Type
        //Parent p = new Child();
        //
        //
        //Reference type → Parent
        //
        //Object type → Child
        // For overloaded methods, compiler checks ONLY reference type.
        // Compiler checks Parent class methods
        //
        //Parent has only:
        //
        //void m(Object o)
        //
        //
        //Even though "abc" is a String,
        //String is also an Object, so this is valid.
        // Overloading → Compile-time → Reference type matters
        //✅ Overriding → Runtime → Object type matters
    }
}
