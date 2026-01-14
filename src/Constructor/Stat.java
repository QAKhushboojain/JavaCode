package Constructor;
// Constructor and static initialization timing
public class Stat {
    static
    {
        System.out.println("Static");
    }
    Stat()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Stat();
        new Stat();
        // Explanation: Static block runs once at class load; constructor runs each time.
    }
}
