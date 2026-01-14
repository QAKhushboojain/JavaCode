package Constructor;

public class ClassG {

    // Instance Initializer Block
    {
        System.out.println("Instance Block");
    }

    // Constructor
    ClassG() {
        System.out.println("Constructor");
    }

    // Instance initializer block vs constructor
    public static void main(String[] args) {
        new ClassG();
        // Explanation: Instance initializer runs before constructor for every object.
    }
    // Explanation: Instance initializer runs before constructor for every object.
}

