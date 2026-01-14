package Constructor;

public class S2 extends S1{
    int y = printlnit("S2.field");
    S2()
    {
        System.out.println("S2.Constructor");
    }

    public static void main(String[] args) {
        new S2();
        // Explanation: Instance fields of parent initialize before parent ctor finishes; child fields initialize after parent ctor completes and before child ctor body.
    }
}
