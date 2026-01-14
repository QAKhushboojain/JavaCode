package Constructor;

public class ClassQ extends ClassP{
    ClassQ()
    {
        super(9);
        System.out.println("ClassQ()");
    }

    public static void main(String[] args) {
        new ClassQ();
        // Explanation: super(9) calls parameterized parent constructor.
    }
}
