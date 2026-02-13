package Static_Non_Static_Behavior;

public class A8 {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    A8()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        new A8();
        // Explanation: static block runs once before main; instance block then constructor for object creation.
    }
}
