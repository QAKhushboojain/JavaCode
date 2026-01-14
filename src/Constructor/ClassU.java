package Constructor;
// Constructor throwing RuntimeException
public class ClassU {
    ClassU()
    {
        throw new RuntimeException("rte");
    }

    public static void main(String[] args) {
        new ClassU();
        // Exception in thread "main" java.lang.RuntimeException: rte
        //    at U.<init>(U.java:...)
        //    at U.main(U.java:...)
        //Explanation: Uncaught runtime exception propagates and terminates program
    }
}
