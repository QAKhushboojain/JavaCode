package InheritancePolymorphism;

public class Test27 {
    public static void main(String[] args) {
        Parent20 p = new Child20();
        System.out.println(p.x);
        System.out.println(Child20.x);
        // Explanation: static fields accessed by reference type; Child.x uses Child.
    }
}
