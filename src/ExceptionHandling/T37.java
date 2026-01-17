package ExceptionHandling;
// Exception in static block + later access
public class T37 {
    static {
        if(true) throw new RuntimeException("init");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // Explanation: Class initialization fails before main; main not run.
    }
}
