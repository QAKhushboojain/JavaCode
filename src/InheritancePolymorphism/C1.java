package InheritancePolymorphism;

public class C1 implements I3,I4{
    public void d()
    {
        I3.super.d();
        I4.super.d();
        System.out.println("C");
    }
}
