package Constructor;

public class Constructor_Day3_C {
    // Parameterized constructor
    int x ; // Declares instance variable
    Constructor_Day3_C(int x)
    {
        this.x = x;
        // this.x , instance variable
        // x  constructor parameter

    }

    public static void main(String[] args) {
        Constructor_Day3_C c = new Constructor_Day3_C(42);
        System.out.println(c.x);
        // Explanation: Parameter passed to constructor stored in instance variable.
    }
}
