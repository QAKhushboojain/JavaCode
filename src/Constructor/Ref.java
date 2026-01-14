package Constructor;
// Constructor visibility & reflection newInstance (access)
import java.lang.reflect.Constructor;
class Ref {

    private Ref() {
        System.out.println("private");
    }

    public static void main(String[] args) throws Exception {

        Constructor<Ref> c = Ref.class.getDeclaredConstructor(); // get private ctor
        c.setAccessible(true);                                  // bypass private
        c.newInstance();                                        // create object
    }
    // Explanation: Reflection can create instance even with private constructor after setAccessible(true).
}