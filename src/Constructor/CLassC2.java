package Constructor;
// Constructor and super() chain across multiple levels
public class CLassC2 extends ClassB2{
    CLassC2()
    {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new CLassC2();
        // Explanation: Highest ancestor ctor runs first, then down chain
    }
}
