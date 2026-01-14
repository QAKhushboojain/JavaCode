package Constructor;

public class Constructor_Day2_ClassB {
    // No explicit constructor (compiler-provided default)
    int x = 10; // instance variable

    public static void main(String[] args) {
        Constructor_Day2_ClassB b = new Constructor_Day2_ClassB();
        System.out.println(b.x);
        // Explanation: No user constructor; compiler creates default constructor that does nothing extra; field initializer used.
    }
}
