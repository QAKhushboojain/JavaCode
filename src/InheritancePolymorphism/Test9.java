package InheritancePolymorphism;

public class Test9 {
    public static void main(String[] args) {
        new Child9();
        // Rule 1: super() is always first
        //
        //In any constructor:
        //
        //Either you write super() explicitly
        //
        //Or Java inserts it automatically
        //
        //And it must be the first statement.
        // Rule 2: Object builds from top to bottom
        //
        //Memory + initialization order:
        //
        //Object class constructor
        //
        //Parent class constructor
        //
        //Child class constructor
        //
        //So hierarchy builds from parent to child.
        // In inheritance, parent constructor is always executed before child constructor because Java automatically inserts super() as the first statement in child constructor.
        // Explanation: Parent constructor executes before Child constructor.
    }
}
