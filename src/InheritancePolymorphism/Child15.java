package InheritancePolymorphism;

public class Child15 extends Parent15{
    // void m() throws Exception, IOException {} // illegal to add broader checked exception
// (compile-time: overriding method cannot throw broader checked exceptions)
//Explanation: Overriding method cannot declare new checked exceptions not in parent method; it may narrow or remove.
}
