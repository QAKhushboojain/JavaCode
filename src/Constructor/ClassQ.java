package Constructor;

public class ClassQ extends ClassP{
    //  explicit super(args)
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
