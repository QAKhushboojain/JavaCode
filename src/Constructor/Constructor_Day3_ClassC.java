package Constructor;

public class Constructor_Day3_ClassC {
    // Parameterized constructor
    int x ; // Declares instance variable
    Constructor_Day3_ClassC(int x)
    {
        this.x = x;
        // this.x , instance variable
        // x  constructor parameter

    }

    public static void main(String[] args) {
        Constructor_Day3_ClassC c = new Constructor_Day3_ClassC(42);
        System.out.println(c.x);
        // Explanation: Parameter passed to constructor stored in instance variable.
    }
}
