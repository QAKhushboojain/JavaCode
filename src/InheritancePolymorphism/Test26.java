package InheritancePolymorphism;

public class Test26 {
    public static void main(String[] args) {
        Parent19 p = new Child19();
        p.m(10); // // 10 is int -> autobox to Integer, but reference type Parent
// Explanation: Overload resolution uses compile-time reference type Parent — m(Number) chosen.
    }
}
