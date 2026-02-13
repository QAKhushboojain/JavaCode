package Static_Non_Static_Behavior;

public class A9 {
    {
        System.out.println("Instance");
    }
    A9()
    {
        System.out.println("CTOR");
    }

    public static void main(String[] args) {
        new A9();
        new A9();
        // Explanation: instance initializer and constructor execute for each new object.
        // Multiple objects: instance block runs each time
    }
}
