package InheritancePolymorphism;

public class Test3 {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        System.out.println(p.name);
        // Explanation: Field access is compile-time based on reference type — p is Parent.
        // Step 1: Variables in Both Classes
        //
        //Both Parent and Child have a variable with the same name:
        //
        //Parent → name = "Parent"
        //Child  → name = "Child"

        // This is not method overriding ❌
        //This is called 👉 variable hiding.
       /* Step 2: Reference vs Object
        Parent p = new Child();

        Part	Meaning
        Parent p	Reference type is Parent
        new Child()	Object is Child */

        // At compile time, Java looks at reference type
        //
        //At runtime, object is Child
        //
        //But this rule is different for variables vs methods.
        // Variables are accessed using the REFERENCE type, not the OBJECT type.
        // Even though object is Child, variable comes from Parent.
        // Parent p = new Child();
        //Java looks at:
        //
        //👉 Left side type (Parent) to access variables
        //
        //👉 Right side object (Child) only matters for methods
        // Variables are resolved at compile time using reference type.
        //Methods are resolved at runtime using object type.
        // Explanation: Field access is compile-time based on reference type — p is Parent.
    }
}
