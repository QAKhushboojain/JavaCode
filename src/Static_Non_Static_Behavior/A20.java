package Static_Non_Static_Behavior;

public class A20 {
    void show()
    {
        System.out.println("Instance Show");
    }
    static void s()
    {
        new A20().show();
    }

    public static void main(String[] args) {
        s();
        // Explanation: static method can create object and call instance method.
    }
}
