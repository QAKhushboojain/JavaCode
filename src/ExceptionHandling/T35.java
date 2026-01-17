package ExceptionHandling;
// Exception propagation across call stack
public class T35 {
    static void a(){
        b();
    }
    static void b()
    {
        c();
    }
    static void c()
    {
        throw new RuntimeException("Err");
    }

    public static void main(String[] args) {
        try {
            a();
        }
        catch (Exception e)
        {
            e.printStackTrace();

           //  Explanation: Exception thrown in c() propagates up; stack trace shows call chain.

        }
    }
}
