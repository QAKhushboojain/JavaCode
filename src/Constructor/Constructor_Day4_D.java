package Constructor;

public class Constructor_Day4_D {
    // Constructor overloading
    Constructor_Day4_D()
    {
        System.out.println("Constructor_Day4_D()");
    }
    Constructor_Day4_D(int x)
    {
        System.out.println("Constructor_Day4_D(int )");
    }

    public static void main(String[] args) {
        new Constructor_Day4_D();
        new Constructor_Day4_D(5);
        // Explanation: Both constructors invoked in order of creation.
        // Constructor	Called When
        //D()	         new D()
        //D(int)	     new D(5)
    }
}
