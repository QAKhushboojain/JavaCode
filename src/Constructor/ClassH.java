package Constructor;

public class ClassH {
    // Static block, instance block, constructor order
    static
    {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    ClassH()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
       new  ClassH();
       new ClassH();
       // Explanation: Static block runs once at class load; instance block & ctor run per object; instance block runs before constructor.
    }
}
