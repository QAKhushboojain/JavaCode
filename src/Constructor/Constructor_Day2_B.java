package Constructor;

public class Constructor_Day2_B {
    // No explicit constructor (compiler-provided default)
    int x = 10; // instance variable

    public static void main(String[] args) {
        Constructor_Day2_B b = new Constructor_Day2_B();
        System.out.println(b.x);
        // Explanation: No user constructor; compiler creates default constructor that does nothing extra; field initializer used.
    }
}
