package InheritancePolymorphism;

public class Test26 {
    public static void main(String[] args) {
        Parent19 p = new Child19();
        p.m(10); // // 10 is int -> autobox to Integer, but reference type Parent
// Explanation: Overload resolution uses compile-time reference type Parent — m(Number) chosen.
  // Overloading → decided at compile time (Reference type)
        //Overriding → decided at runtime (Object type)
        // Compile time: choose method based on reference type (overloading resolution)
        //
        //Runtime: if that method is overridden, then child’s version is called
    }
}
