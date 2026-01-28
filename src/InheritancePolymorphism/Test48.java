package InheritancePolymorphism;

public class Test48 {
    public static void main(String[] args) {
        P2 p = new P2(1);
        C10 c = new C10(1);
        System.out.println(p.equals(c));
        System.out.println(c.equals(p));
        // Explanation: equals uses instanceof P so both compare true; careful talk about symmetry and design required in real code.

    }

}
