package InheritancePolymorphism;

public class Test21 {
    public static void main(String[] args) {
        I5 i = new B2();
        i.m();
        // Explanation: Interface reference points to B instance — runtime binding.
    }
}
