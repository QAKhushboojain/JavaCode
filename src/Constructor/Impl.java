package Constructor;

public class Impl extends Abs{
    // Constructor of abstract class (called via subclass)
    Impl()
    {
        System.out.println("Impl()");
    }

    public static void main(String[] args) {
        new Impl();
        // Explanation: Abstract class can have constructor; subclass constructor calls it.
    }
}
