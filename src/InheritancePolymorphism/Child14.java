package InheritancePolymorphism;

public class Child14 extends Parent14{
    @Override Child14 get()
    {
        System.out.println("Child Get");
        return new Child14();
    }
}
