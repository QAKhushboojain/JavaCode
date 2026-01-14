package Constructor;
// Constructor and subclass overriding (constructors are not inherited)
public class Sub extends Base{
    Sub(int x)
    {
        System.out.println("Sub "+ x);
    }

    public static void main(String[] args) {
        new Sub(5);
        // Explanation: Constructors are not inherited — subclass defines own constructors; super() implicitly called.
    }
}
