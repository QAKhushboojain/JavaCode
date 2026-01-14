package Constructor;

public class ClassJ {
    void ClassJ()
    {
        System.out.println("Not Constructor");
    }

    public static void main(String[] args) {
        new ClassJ();
        // Output
        //(nothing printed)
        // Explanation: void J() is a method, not a constructor; default constructor used (empty) — nothing printed.
    }
}
