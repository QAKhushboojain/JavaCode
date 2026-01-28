package InheritancePolymorphism;

public class C8 extends P1 {
    C8() {
        this(5);
        System.out.println("C8()");
    }

    C8(int x) {
        super(x);
        System.out.println("C8(int)");
    }
}



