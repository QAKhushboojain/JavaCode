package ExceptionHandling;
// Exception thrown in finally overrides return value (return + finally combo)
public class T25 {
    static int m()
    {
        try {
            return 1;
        }
        finally {
            if(true) throw new RuntimeException("f");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
        // Explanation: Exception from finally prevents return; exception propagates.
    }
}
