package InheritancePolymorphism;

public class Test35 {
    public static void main(String[] args) {
        I10 i = new I10(){
            public void m()
            { System.out.println("Anonymous"); }
        };
        i.m();
// Explanation: Anonymous class provides implementation at runtime.
    }
}
