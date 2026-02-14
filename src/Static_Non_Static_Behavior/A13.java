package Static_Non_Static_Behavior;

public class A13 {
    static void s()
    {
        System.out.println("s");
    }
    void i()
    {
        s();
        System.out.println("i");
    }

    public static void main(String[] args) {
        new A13().i();
        // Explanation: instance method can call static directly.
    }
}
