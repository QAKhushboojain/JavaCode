package Constructor;

public class Constructor_Day5_ClassE {
    // this() call chaining
    Constructor_Day5_ClassE()
    {
        System.out.println("Constructor_Day5_ClassE()");
    }
    Constructor_Day5_ClassE(int x )
    {
        this();
        System.out.println("Constructor_Day5_ClassE(int)");
    }

    public static void main(String[] args) {
        new Constructor_Day5_ClassE(7);
        // Explanation: this() calls no-arg constructor before continuing.
    }
}
