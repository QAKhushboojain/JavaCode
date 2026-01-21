package InheritancePolymorphism;

public class Test6 {
    public static void main(String[] args) {
        Parent6 p = new Child6();
        p.call();
        // Explanation: Private methods are not visible to subclasses — call() calls Parent's private secret().
        // Rule 1: private methods are NOT inherited
        //
        //Parent.secret() is private
        //
        //So Child does not inherit it
        //
        //That means no overriding happens
        //
        //So this is NOT overriding — it is method hiding (separate methods).
        // Parent has its own secret()
        //Child has its own different secret()
        // Rule 2: Method call inside Parent stays in Parent
        //void call() { secret(); }
        //
        //
        //This secret() is resolved at compile time to:
        //
        //👉 Parent.secret()
        // secret() is private
        //
        //Private methods use static binding, not dynamic binding
        // Overriding happens only when method is:
        //
        //public, protected, or default
        //
        //NOT private
        //
        //Same method signature
      //  Private methods:

      //  Are not inherited

      //  Are not overridden

       // Are statically bound
    }
}
