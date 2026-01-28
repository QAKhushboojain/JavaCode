package InheritancePolymorphism;

public class Test56 {
    public static void main(String[] args) {
        AA a = new AA(1);
        BB b = new BB(1,2);
        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(a)); // true (but can break symmetry if B overrides equals differently)
// Explanation: illustrate design pitfalls — discuss in teaching.
    }
}
