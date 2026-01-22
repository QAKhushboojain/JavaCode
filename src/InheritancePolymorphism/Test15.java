package InheritancePolymorphism;

public class Test15 {
    public static void main(String[] args) {
        Parent12 p = new Parent12();
        Child12 c = (Child12) p ; // Run time Problem
        // Exception in thread "main" java.lang.ClassCastException: Parent cannot be cast to Child
        //Explanation: Actual object is Parent; cannot cast to Child
    }
}
