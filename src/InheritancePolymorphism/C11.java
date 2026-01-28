package InheritancePolymorphism;

public class C11 extends P3{
    void m()
    {
        System.out.println("C");
    }
    void test()
    {
        this.m();
        super.m();
    }
}

