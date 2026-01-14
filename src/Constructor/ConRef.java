package Constructor;
// Constructor reference using method reference (functional interface)
import java.util.function.Supplier;

public class ConRef {
    ConRef()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Supplier<ConRef> s = ConRef::new;
        s.get();
        // Explanation: Constructor reference used to obtain new object through Supplier.
    }
}
