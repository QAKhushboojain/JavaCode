package Static_Non_Static_Behavior;

public class A1 {
    void n()
    {
        System.out.println("Instance N ");
    }

    public static void main(String[] args) {
        A1 a = new A1();
        a.n();
        // Explanation: instance method requires object; calling works.
    }
}
